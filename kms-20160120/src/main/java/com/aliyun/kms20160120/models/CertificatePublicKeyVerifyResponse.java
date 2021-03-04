// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CertificatePublicKeyVerifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CertificatePublicKeyVerifyResponse setBody(CertificatePublicKeyVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public CertificatePublicKeyVerifyResponseBody getBody() {
        return this.body;
    }

}
