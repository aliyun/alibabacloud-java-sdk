// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetExternalSAMLIdentityProviderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetExternalSAMLIdentityProviderResponse setBody(GetExternalSAMLIdentityProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExternalSAMLIdentityProviderResponseBody getBody() {
        return this.body;
    }

}
