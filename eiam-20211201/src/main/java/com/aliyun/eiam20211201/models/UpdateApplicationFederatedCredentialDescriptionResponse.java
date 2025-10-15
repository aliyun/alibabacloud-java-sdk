// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationFederatedCredentialDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApplicationFederatedCredentialDescriptionResponseBody body;

    public static UpdateApplicationFederatedCredentialDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationFederatedCredentialDescriptionResponse self = new UpdateApplicationFederatedCredentialDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationFederatedCredentialDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationFederatedCredentialDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationFederatedCredentialDescriptionResponse setBody(UpdateApplicationFederatedCredentialDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationFederatedCredentialDescriptionResponseBody getBody() {
        return this.body;
    }

}
