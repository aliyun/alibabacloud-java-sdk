// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CertificatePrivateKeyDecryptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CertificatePrivateKeyDecryptResponseBody body;

    public static CertificatePrivateKeyDecryptResponse build(java.util.Map<String, ?> map) throws Exception {
        CertificatePrivateKeyDecryptResponse self = new CertificatePrivateKeyDecryptResponse();
        return TeaModel.build(map, self);
    }

    public CertificatePrivateKeyDecryptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CertificatePrivateKeyDecryptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CertificatePrivateKeyDecryptResponse setBody(CertificatePrivateKeyDecryptResponseBody body) {
        this.body = body;
        return this;
    }
    public CertificatePrivateKeyDecryptResponseBody getBody() {
        return this.body;
    }

}
