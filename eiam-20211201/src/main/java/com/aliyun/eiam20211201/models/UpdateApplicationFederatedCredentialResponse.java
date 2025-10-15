// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationFederatedCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApplicationFederatedCredentialResponseBody body;

    public static UpdateApplicationFederatedCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationFederatedCredentialResponse self = new UpdateApplicationFederatedCredentialResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationFederatedCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationFederatedCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationFederatedCredentialResponse setBody(UpdateApplicationFederatedCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationFederatedCredentialResponseBody getBody() {
        return this.body;
    }

}
