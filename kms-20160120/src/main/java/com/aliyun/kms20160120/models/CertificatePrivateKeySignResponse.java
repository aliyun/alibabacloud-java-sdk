// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CertificatePrivateKeySignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CertificatePrivateKeySignResponse setBody(CertificatePrivateKeySignResponseBody body) {
        this.body = body;
        return this;
    }
    public CertificatePrivateKeySignResponseBody getBody() {
        return this.body;
    }

}
