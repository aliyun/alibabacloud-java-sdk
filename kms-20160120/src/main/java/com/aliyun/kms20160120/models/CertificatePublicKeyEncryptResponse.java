// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CertificatePublicKeyEncryptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CertificatePublicKeyEncryptResponseBody body;

    public static CertificatePublicKeyEncryptResponse build(java.util.Map<String, ?> map) throws Exception {
        CertificatePublicKeyEncryptResponse self = new CertificatePublicKeyEncryptResponse();
        return TeaModel.build(map, self);
    }

    public CertificatePublicKeyEncryptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CertificatePublicKeyEncryptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CertificatePublicKeyEncryptResponse setBody(CertificatePublicKeyEncryptResponseBody body) {
        this.body = body;
        return this;
    }
    public CertificatePublicKeyEncryptResponseBody getBody() {
        return this.body;
    }

}
