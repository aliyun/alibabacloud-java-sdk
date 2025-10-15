// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateApplicationFederatedCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApplicationFederatedCredentialResponseBody body;

    public static CreateApplicationFederatedCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationFederatedCredentialResponse self = new CreateApplicationFederatedCredentialResponse();
        return TeaModel.build(map, self);
    }

    public CreateApplicationFederatedCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApplicationFederatedCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApplicationFederatedCredentialResponse setBody(CreateApplicationFederatedCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApplicationFederatedCredentialResponseBody getBody() {
        return this.body;
    }

}
