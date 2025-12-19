// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateOAuth2CredentialProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOAuth2CredentialProviderResponseBody body;

    public static UpdateOAuth2CredentialProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOAuth2CredentialProviderResponse self = new UpdateOAuth2CredentialProviderResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOAuth2CredentialProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOAuth2CredentialProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOAuth2CredentialProviderResponse setBody(UpdateOAuth2CredentialProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOAuth2CredentialProviderResponseBody getBody() {
        return this.body;
    }

}
