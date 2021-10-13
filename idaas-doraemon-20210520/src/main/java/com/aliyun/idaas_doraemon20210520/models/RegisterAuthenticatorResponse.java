// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class RegisterAuthenticatorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RegisterAuthenticatorResponse setBody(RegisterAuthenticatorResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterAuthenticatorResponseBody getBody() {
        return this.body;
    }

}
