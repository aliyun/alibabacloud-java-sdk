// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetFederatedCredentialProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFederatedCredentialProviderResponseBody body;

    public static GetFederatedCredentialProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFederatedCredentialProviderResponse self = new GetFederatedCredentialProviderResponse();
        return TeaModel.build(map, self);
    }

    public GetFederatedCredentialProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFederatedCredentialProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFederatedCredentialProviderResponse setBody(GetFederatedCredentialProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFederatedCredentialProviderResponseBody getBody() {
        return this.body;
    }

}
