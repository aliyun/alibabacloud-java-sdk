// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableCredentialProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableCredentialProviderResponseBody body;

    public static EnableCredentialProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableCredentialProviderResponse self = new EnableCredentialProviderResponse();
        return TeaModel.build(map, self);
    }

    public EnableCredentialProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableCredentialProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableCredentialProviderResponse setBody(EnableCredentialProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableCredentialProviderResponseBody getBody() {
        return this.body;
    }

}
