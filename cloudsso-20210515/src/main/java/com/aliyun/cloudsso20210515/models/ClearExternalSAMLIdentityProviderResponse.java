// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ClearExternalSAMLIdentityProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClearExternalSAMLIdentityProviderResponseBody body;

    public static ClearExternalSAMLIdentityProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearExternalSAMLIdentityProviderResponse self = new ClearExternalSAMLIdentityProviderResponse();
        return TeaModel.build(map, self);
    }

    public ClearExternalSAMLIdentityProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearExternalSAMLIdentityProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClearExternalSAMLIdentityProviderResponse setBody(ClearExternalSAMLIdentityProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearExternalSAMLIdentityProviderResponseBody getBody() {
        return this.body;
    }

}
