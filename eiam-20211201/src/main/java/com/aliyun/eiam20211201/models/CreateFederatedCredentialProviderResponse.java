// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateFederatedCredentialProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFederatedCredentialProviderResponseBody body;

    public static CreateFederatedCredentialProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFederatedCredentialProviderResponse self = new CreateFederatedCredentialProviderResponse();
        return TeaModel.build(map, self);
    }

    public CreateFederatedCredentialProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFederatedCredentialProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFederatedCredentialProviderResponse setBody(CreateFederatedCredentialProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFederatedCredentialProviderResponseBody getBody() {
        return this.body;
    }

}
