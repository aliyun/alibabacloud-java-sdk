// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateFederatedCredentialProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFederatedCredentialProviderResponseBody body;

    public static UpdateFederatedCredentialProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFederatedCredentialProviderResponse self = new UpdateFederatedCredentialProviderResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFederatedCredentialProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFederatedCredentialProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFederatedCredentialProviderResponse setBody(UpdateFederatedCredentialProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFederatedCredentialProviderResponseBody getBody() {
        return this.body;
    }

}
