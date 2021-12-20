// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class AuthorizeProductVersionResponseBody extends TeaModel {
    // 错误码
    @NameInMap("code")
    public String code;

    // 错误信息
    @NameInMap("msg")
    public String msg;

    public static AuthorizeProductVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeProductVersionResponseBody self = new AuthorizeProductVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthorizeProductVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AuthorizeProductVersionResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
