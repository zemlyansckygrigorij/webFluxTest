package com.example.webfluxtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserService service;
    @GetMapping("/me")
    public Mono<User> whoAmI() {
        return service.getUserByIdSync("1");
    }
}
