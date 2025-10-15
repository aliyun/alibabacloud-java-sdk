// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableApplicationFederatedCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableApplicationFederatedCredentialResponseBody body;

    public static EnableApplicationFederatedCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationFederatedCredentialResponse self = new EnableApplicationFederatedCredentialResponse();
        return TeaModel.build(map, self);
    }

    public EnableApplicationFederatedCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableApplicationFederatedCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableApplicationFederatedCredentialResponse setBody(EnableApplicationFederatedCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableApplicationFederatedCredentialResponseBody getBody() {
        return this.body;
    }

}
