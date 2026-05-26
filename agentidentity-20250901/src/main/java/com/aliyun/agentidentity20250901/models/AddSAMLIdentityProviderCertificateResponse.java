// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class AddSAMLIdentityProviderCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddSAMLIdentityProviderCertificateResponseBody body;

    public static AddSAMLIdentityProviderCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSAMLIdentityProviderCertificateResponse self = new AddSAMLIdentityProviderCertificateResponse();
        return TeaModel.build(map, self);
    }

    public AddSAMLIdentityProviderCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSAMLIdentityProviderCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSAMLIdentityProviderCertificateResponse setBody(AddSAMLIdentityProviderCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSAMLIdentityProviderCertificateResponseBody getBody() {
        return this.body;
    }

}
