// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class CreateSSLCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSSLCertificateResponseBody body;

    public static CreateSSLCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSSLCertificateResponse self = new CreateSSLCertificateResponse();
        return TeaModel.build(map, self);
    }

    public CreateSSLCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSSLCertificateResponse setBody(CreateSSLCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSSLCertificateResponseBody getBody() {
        return this.body;
    }

}
