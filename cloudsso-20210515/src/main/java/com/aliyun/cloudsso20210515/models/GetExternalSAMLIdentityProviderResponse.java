// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetExternalSAMLIdentityProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExternalSAMLIdentityProviderResponseBody body;

    public static GetExternalSAMLIdentityProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExternalSAMLIdentityProviderResponse self = new GetExternalSAMLIdentityProviderResponse();
        return TeaModel.build(map, self);
    }

    public GetExternalSAMLIdentityProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExternalSAMLIdentityProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExternalSAMLIdentityProviderResponse setBody(GetExternalSAMLIdentityProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExternalSAMLIdentityProviderResponseBody getBody() {
        return this.body;
    }

}
