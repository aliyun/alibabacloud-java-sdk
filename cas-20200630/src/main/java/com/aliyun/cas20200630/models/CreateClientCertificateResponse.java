// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateClientCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateClientCertificateResponseBody body;

    public static CreateClientCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClientCertificateResponse self = new CreateClientCertificateResponse();
        return TeaModel.build(map, self);
    }

    public CreateClientCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClientCertificateResponse setBody(CreateClientCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClientCertificateResponseBody getBody() {
        return this.body;
    }

}
