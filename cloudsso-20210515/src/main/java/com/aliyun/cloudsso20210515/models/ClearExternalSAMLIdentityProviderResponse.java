// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ClearExternalSAMLIdentityProviderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ClearExternalSAMLIdentityProviderResponse setBody(ClearExternalSAMLIdentityProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearExternalSAMLIdentityProviderResponseBody getBody() {
        return this.body;
    }

}
