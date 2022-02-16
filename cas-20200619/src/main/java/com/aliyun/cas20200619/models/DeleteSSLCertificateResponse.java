// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class DeleteSSLCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSSLCertificateResponseBody body;

    public static DeleteSSLCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSSLCertificateResponse self = new DeleteSSLCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSSLCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSSLCertificateResponse setBody(DeleteSSLCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSSLCertificateResponseBody getBody() {
        return this.body;
    }

}
