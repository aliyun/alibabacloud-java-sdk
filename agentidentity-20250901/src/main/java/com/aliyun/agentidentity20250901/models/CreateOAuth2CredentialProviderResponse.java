// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateOAuth2CredentialProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOAuth2CredentialProviderResponseBody body;

    public static CreateOAuth2CredentialProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOAuth2CredentialProviderResponse self = new CreateOAuth2CredentialProviderResponse();
        return TeaModel.build(map, self);
    }

    public CreateOAuth2CredentialProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOAuth2CredentialProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOAuth2CredentialProviderResponse setBody(CreateOAuth2CredentialProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOAuth2CredentialProviderResponseBody getBody() {
        return this.body;
    }

}
