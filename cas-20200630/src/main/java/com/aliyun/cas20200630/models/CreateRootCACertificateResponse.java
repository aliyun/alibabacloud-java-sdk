// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateRootCACertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRootCACertificateResponseBody body;

    public static CreateRootCACertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRootCACertificateResponse self = new CreateRootCACertificateResponse();
        return TeaModel.build(map, self);
    }

    public CreateRootCACertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRootCACertificateResponse setBody(CreateRootCACertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRootCACertificateResponseBody getBody() {
        return this.body;
    }

}
