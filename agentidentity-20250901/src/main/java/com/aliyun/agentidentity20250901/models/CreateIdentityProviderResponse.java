// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateIdentityProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIdentityProviderResponseBody body;

    public static CreateIdentityProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIdentityProviderResponse self = new CreateIdentityProviderResponse();
        return TeaModel.build(map, self);
    }

    public CreateIdentityProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIdentityProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIdentityProviderResponse setBody(CreateIdentityProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIdentityProviderResponseBody getBody() {
        return this.body;
    }

}
