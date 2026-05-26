// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteSAMLIdentityProviderCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSAMLIdentityProviderCertificateResponseBody body;

    public static DeleteSAMLIdentityProviderCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSAMLIdentityProviderCertificateResponse self = new DeleteSAMLIdentityProviderCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSAMLIdentityProviderCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSAMLIdentityProviderCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSAMLIdentityProviderCertificateResponse setBody(DeleteSAMLIdentityProviderCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSAMLIdentityProviderCertificateResponseBody getBody() {
        return this.body;
    }

}
