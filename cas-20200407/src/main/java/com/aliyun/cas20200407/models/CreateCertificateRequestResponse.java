// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCertificateRequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCertificateRequestResponseBody body;

    public static CreateCertificateRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateRequestResponse self = new CreateCertificateRequestResponse();
        return TeaModel.build(map, self);
    }

    public CreateCertificateRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCertificateRequestResponse setBody(CreateCertificateRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCertificateRequestResponseBody getBody() {
        return this.body;
    }

}
