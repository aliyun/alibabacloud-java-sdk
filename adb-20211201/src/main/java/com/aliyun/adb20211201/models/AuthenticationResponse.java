// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class AuthenticationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AuthenticationResponseBody body;

    public static AuthenticationResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthenticationResponse self = new AuthenticationResponse();
        return TeaModel.build(map, self);
    }

    public AuthenticationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthenticationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthenticationResponse setBody(AuthenticationResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthenticationResponseBody getBody() {
        return this.body;
    }

}
