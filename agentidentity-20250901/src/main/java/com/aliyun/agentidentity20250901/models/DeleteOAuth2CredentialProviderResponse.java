// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteOAuth2CredentialProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOAuth2CredentialProviderResponseBody body;

    public static DeleteOAuth2CredentialProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOAuth2CredentialProviderResponse self = new DeleteOAuth2CredentialProviderResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOAuth2CredentialProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOAuth2CredentialProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOAuth2CredentialProviderResponse setBody(DeleteOAuth2CredentialProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOAuth2CredentialProviderResponseBody getBody() {
        return this.body;
    }

}
