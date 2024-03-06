// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CertificatePrivateKeySignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CertificatePrivateKeySignResponseBody body;

    public static CertificatePrivateKeySignResponse build(java.util.Map<String, ?> map) throws Exception {
        CertificatePrivateKeySignResponse self = new CertificatePrivateKeySignResponse();
        return TeaModel.build(map, self);
    }

    public CertificatePrivateKeySignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CertificatePrivateKeySignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CertificatePrivateKeySignResponse setBody(CertificatePrivateKeySignResponseBody body) {
        this.body = body;
        return this;
    }
    public CertificatePrivateKeySignResponseBody getBody() {
        return this.body;
    }

}
