// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class RegisterAuthenticatorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RegisterAuthenticatorResponseBody body;

    public static RegisterAuthenticatorResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterAuthenticatorResponse self = new RegisterAuthenticatorResponse();
        return TeaModel.build(map, self);
    }

    public RegisterAuthenticatorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterAuthenticatorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterAuthenticatorResponse setBody(RegisterAuthenticatorResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterAuthenticatorResponseBody getBody() {
        return this.body;
    }

}
