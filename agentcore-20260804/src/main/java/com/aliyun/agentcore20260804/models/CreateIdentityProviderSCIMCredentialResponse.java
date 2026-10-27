// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateIdentityProviderSCIMCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIdentityProviderSCIMCredentialResponseBody body;

    public static CreateIdentityProviderSCIMCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIdentityProviderSCIMCredentialResponse self = new CreateIdentityProviderSCIMCredentialResponse();
        return TeaModel.build(map, self);
    }

    public CreateIdentityProviderSCIMCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIdentityProviderSCIMCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIdentityProviderSCIMCredentialResponse setBody(CreateIdentityProviderSCIMCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIdentityProviderSCIMCredentialResponseBody getBody() {
        return this.body;
    }

}
