// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class InitiateOidcAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitiateOidcAuthResponseBody body;

    public static InitiateOidcAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        InitiateOidcAuthResponse self = new InitiateOidcAuthResponse();
        return TeaModel.build(map, self);
    }

    public InitiateOidcAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitiateOidcAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitiateOidcAuthResponse setBody(InitiateOidcAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public InitiateOidcAuthResponseBody getBody() {
        return this.body;
    }

}
