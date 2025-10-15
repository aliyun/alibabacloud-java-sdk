// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableApplicationFederatedCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableApplicationFederatedCredentialResponseBody body;

    public static DisableApplicationFederatedCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableApplicationFederatedCredentialResponse self = new DisableApplicationFederatedCredentialResponse();
        return TeaModel.build(map, self);
    }

    public DisableApplicationFederatedCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableApplicationFederatedCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableApplicationFederatedCredentialResponse setBody(DisableApplicationFederatedCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableApplicationFederatedCredentialResponseBody getBody() {
        return this.body;
    }

}
