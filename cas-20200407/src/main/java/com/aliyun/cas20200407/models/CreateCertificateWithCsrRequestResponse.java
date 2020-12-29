// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCertificateWithCsrRequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCertificateWithCsrRequestResponseBody body;

    public static CreateCertificateWithCsrRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateWithCsrRequestResponse self = new CreateCertificateWithCsrRequestResponse();
        return TeaModel.build(map, self);
    }

    public CreateCertificateWithCsrRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCertificateWithCsrRequestResponse setBody(CreateCertificateWithCsrRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCertificateWithCsrRequestResponseBody getBody() {
        return this.body;
    }

}
