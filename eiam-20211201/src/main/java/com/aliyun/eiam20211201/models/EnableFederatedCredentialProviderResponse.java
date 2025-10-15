// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableFederatedCredentialProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableFederatedCredentialProviderResponseBody body;

    public static EnableFederatedCredentialProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableFederatedCredentialProviderResponse self = new EnableFederatedCredentialProviderResponse();
        return TeaModel.build(map, self);
    }

    public EnableFederatedCredentialProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableFederatedCredentialProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableFederatedCredentialProviderResponse setBody(EnableFederatedCredentialProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableFederatedCredentialProviderResponseBody getBody() {
        return this.body;
    }

}
