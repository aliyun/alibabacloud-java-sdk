// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunauth20181222.models;

import com.aliyun.tea.*;

public class AuthenticateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthenticateResponseBody body;

    public static AuthenticateResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthenticateResponse self = new AuthenticateResponse();
        return TeaModel.build(map, self);
    }

    public AuthenticateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthenticateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthenticateResponse setBody(AuthenticateResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthenticateResponseBody getBody() {
        return this.body;
    }

}
