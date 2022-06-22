// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UserLoginResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UserLoginResponseBody body;

    public static UserLoginResponse build(java.util.Map<String, ?> map) throws Exception {
        UserLoginResponse self = new UserLoginResponse();
        return TeaModel.build(map, self);
    }

    public UserLoginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UserLoginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UserLoginResponse setBody(UserLoginResponseBody body) {
        this.body = body;
        return this;
    }
    public UserLoginResponseBody getBody() {
        return this.body;
    }

}
