// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableFederatedCredentialProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableFederatedCredentialProviderResponseBody body;

    public static DisableFederatedCredentialProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableFederatedCredentialProviderResponse self = new DisableFederatedCredentialProviderResponse();
        return TeaModel.build(map, self);
    }

    public DisableFederatedCredentialProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableFederatedCredentialProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableFederatedCredentialProviderResponse setBody(DisableFederatedCredentialProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableFederatedCredentialProviderResponseBody getBody() {
        return this.body;
    }

}
