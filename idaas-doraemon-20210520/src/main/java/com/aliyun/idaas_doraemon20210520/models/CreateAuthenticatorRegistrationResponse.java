// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class CreateAuthenticatorRegistrationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAuthenticatorRegistrationResponseBody body;

    public static CreateAuthenticatorRegistrationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthenticatorRegistrationResponse self = new CreateAuthenticatorRegistrationResponse();
        return TeaModel.build(map, self);
    }

    public CreateAuthenticatorRegistrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAuthenticatorRegistrationResponse setBody(CreateAuthenticatorRegistrationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAuthenticatorRegistrationResponseBody getBody() {
        return this.body;
    }

}
