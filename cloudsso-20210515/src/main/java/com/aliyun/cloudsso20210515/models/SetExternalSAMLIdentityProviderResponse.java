// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetExternalSAMLIdentityProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SetExternalSAMLIdentityProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetExternalSAMLIdentityProviderResponse setBody(SetExternalSAMLIdentityProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public SetExternalSAMLIdentityProviderResponseBody getBody() {
        return this.body;
    }

}
