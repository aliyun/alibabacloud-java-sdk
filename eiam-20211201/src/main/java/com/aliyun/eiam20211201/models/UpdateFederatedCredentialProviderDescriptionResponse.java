// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateFederatedCredentialProviderDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFederatedCredentialProviderDescriptionResponseBody body;

    public static UpdateFederatedCredentialProviderDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFederatedCredentialProviderDescriptionResponse self = new UpdateFederatedCredentialProviderDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFederatedCredentialProviderDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFederatedCredentialProviderDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFederatedCredentialProviderDescriptionResponse setBody(UpdateFederatedCredentialProviderDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFederatedCredentialProviderDescriptionResponseBody getBody() {
        return this.body;
    }

}
