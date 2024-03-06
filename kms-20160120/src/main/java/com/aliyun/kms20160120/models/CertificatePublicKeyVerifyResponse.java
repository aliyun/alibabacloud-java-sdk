// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CertificatePublicKeyVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CertificatePublicKeyVerifyResponseBody body;

    public static CertificatePublicKeyVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        CertificatePublicKeyVerifyResponse self = new CertificatePublicKeyVerifyResponse();
        return TeaModel.build(map, self);
    }

    public CertificatePublicKeyVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CertificatePublicKeyVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CertificatePublicKeyVerifyResponse setBody(CertificatePublicKeyVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public CertificatePublicKeyVerifyResponseBody getBody() {
        return this.body;
    }

}
