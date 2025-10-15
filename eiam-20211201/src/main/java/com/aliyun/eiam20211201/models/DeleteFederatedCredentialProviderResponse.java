// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteFederatedCredentialProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFederatedCredentialProviderResponseBody body;

    public static DeleteFederatedCredentialProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFederatedCredentialProviderResponse self = new DeleteFederatedCredentialProviderResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFederatedCredentialProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFederatedCredentialProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFederatedCredentialProviderResponse setBody(DeleteFederatedCredentialProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFederatedCredentialProviderResponseBody getBody() {
        return this.body;
    }

}
