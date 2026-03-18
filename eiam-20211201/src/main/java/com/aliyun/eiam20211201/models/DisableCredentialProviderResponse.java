// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableCredentialProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableCredentialProviderResponseBody body;

    public static DisableCredentialProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableCredentialProviderResponse self = new DisableCredentialProviderResponse();
        return TeaModel.build(map, self);
    }

    public DisableCredentialProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableCredentialProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableCredentialProviderResponse setBody(DisableCredentialProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableCredentialProviderResponseBody getBody() {
        return this.body;
    }

}
