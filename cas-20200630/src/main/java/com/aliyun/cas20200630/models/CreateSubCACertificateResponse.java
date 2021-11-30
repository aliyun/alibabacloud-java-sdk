// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateSubCACertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSubCACertificateResponseBody body;

    public static CreateSubCACertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSubCACertificateResponse self = new CreateSubCACertificateResponse();
        return TeaModel.build(map, self);
    }

    public CreateSubCACertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSubCACertificateResponse setBody(CreateSubCACertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSubCACertificateResponseBody getBody() {
        return this.body;
    }

}
