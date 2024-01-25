// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateCustomCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomCertificateResponseBody body;

    public static CreateCustomCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomCertificateResponse self = new CreateCustomCertificateResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomCertificateResponse setBody(CreateCustomCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomCertificateResponseBody getBody() {
        return this.body;
    }

}
