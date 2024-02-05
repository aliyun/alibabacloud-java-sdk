// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs_workbench20220220.models;

import com.aliyun.tea.*;

public class LoginInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LoginInstanceResponseBody body;

    public static LoginInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        LoginInstanceResponse self = new LoginInstanceResponse();
        return TeaModel.build(map, self);
    }

    public LoginInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LoginInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LoginInstanceResponse setBody(LoginInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public LoginInstanceResponseBody getBody() {
        return this.body;
    }

}
