// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListSAMLIdentityProviderCertificatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSAMLIdentityProviderCertificatesResponseBody body;

    public static ListSAMLIdentityProviderCertificatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSAMLIdentityProviderCertificatesResponse self = new ListSAMLIdentityProviderCertificatesResponse();
        return TeaModel.build(map, self);
    }

    public ListSAMLIdentityProviderCertificatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSAMLIdentityProviderCertificatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSAMLIdentityProviderCertificatesResponse setBody(ListSAMLIdentityProviderCertificatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSAMLIdentityProviderCertificatesResponseBody getBody() {
        return this.body;
    }

}
