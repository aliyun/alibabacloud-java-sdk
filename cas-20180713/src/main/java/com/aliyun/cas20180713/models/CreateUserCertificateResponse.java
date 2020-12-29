// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20180713.models;

import com.aliyun.tea.*;

public class CreateUserCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateUserCertificateResponseBody body;

    public static CreateUserCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserCertificateResponse self = new CreateUserCertificateResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserCertificateResponse setBody(CreateUserCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserCertificateResponseBody getBody() {
        return this.body;
    }

}
