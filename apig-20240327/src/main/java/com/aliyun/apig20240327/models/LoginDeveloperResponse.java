// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class LoginDeveloperResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LoginDeveloperResponseBody body;

    public static LoginDeveloperResponse build(java.util.Map<String, ?> map) throws Exception {
        LoginDeveloperResponse self = new LoginDeveloperResponse();
        return TeaModel.build(map, self);
    }

    public LoginDeveloperResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LoginDeveloperResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LoginDeveloperResponse setBody(LoginDeveloperResponseBody body) {
        this.body = body;
        return this;
    }
    public LoginDeveloperResponseBody getBody() {
        return this.body;
    }

}
