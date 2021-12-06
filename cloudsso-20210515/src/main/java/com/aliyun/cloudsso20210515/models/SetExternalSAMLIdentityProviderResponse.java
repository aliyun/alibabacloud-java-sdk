// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetExternalSAMLIdentityProviderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetExternalSAMLIdentityProviderResponseBody body;

    public static SetExternalSAMLIdentityProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        SetExternalSAMLIdentityProviderResponse self = new SetExternalSAMLIdentityProviderResponse();
        return TeaModel.build(map, self);
    }

    public SetExternalSAMLIdentityProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetExternalSAMLIdentityProviderResponse setBody(SetExternalSAMLIdentityProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public SetExternalSAMLIdentityProviderResponseBody getBody() {
        return this.body;
    }

}
