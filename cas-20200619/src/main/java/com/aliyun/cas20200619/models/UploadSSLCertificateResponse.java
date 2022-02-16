// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class UploadSSLCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadSSLCertificateResponseBody body;

    public static UploadSSLCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadSSLCertificateResponse self = new UploadSSLCertificateResponse();
        return TeaModel.build(map, self);
    }

    public UploadSSLCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadSSLCertificateResponse setBody(UploadSSLCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadSSLCertificateResponseBody getBody() {
        return this.body;
    }

}
