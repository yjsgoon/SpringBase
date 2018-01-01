package com.naver.springstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * AUTH: JiSoo Yoon
 * MODIFY:
 * DESC:
 * TODO:
 */
@Controller
public class IndexController {
    @RequestMapping
    public String index() {
        return "index";
    }
}
