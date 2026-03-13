// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GenerateWebAuthnAuthenticatorRegistrationUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateWebAuthnAuthenticatorRegistrationUrlResponseBody body;

    public static GenerateWebAuthnAuthenticatorRegistrationUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateWebAuthnAuthenticatorRegistrationUrlResponse self = new GenerateWebAuthnAuthenticatorRegistrationUrlResponse();
        return TeaModel.build(map, self);
    }

    public GenerateWebAuthnAuthenticatorRegistrationUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateWebAuthnAuthenticatorRegistrationUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateWebAuthnAuthenticatorRegistrationUrlResponse setBody(GenerateWebAuthnAuthenticatorRegistrationUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateWebAuthnAuthenticatorRegistrationUrlResponseBody getBody() {
        return this.body;
    }

}
