// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateClientCertificateWithCsrResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateClientCertificateWithCsrResponseBody body;

    public static CreateClientCertificateWithCsrResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClientCertificateWithCsrResponse self = new CreateClientCertificateWithCsrResponse();
        return TeaModel.build(map, self);
    }

    public CreateClientCertificateWithCsrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClientCertificateWithCsrResponse setBody(CreateClientCertificateWithCsrResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClientCertificateWithCsrResponseBody getBody() {
        return this.body;
    }

}
