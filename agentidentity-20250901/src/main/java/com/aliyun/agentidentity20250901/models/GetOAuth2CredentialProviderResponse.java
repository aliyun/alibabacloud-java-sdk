// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetOAuth2CredentialProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOAuth2CredentialProviderResponseBody body;

    public static GetOAuth2CredentialProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOAuth2CredentialProviderResponse self = new GetOAuth2CredentialProviderResponse();
        return TeaModel.build(map, self);
    }

    public GetOAuth2CredentialProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOAuth2CredentialProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOAuth2CredentialProviderResponse setBody(GetOAuth2CredentialProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOAuth2CredentialProviderResponseBody getBody() {
        return this.body;
    }

}
