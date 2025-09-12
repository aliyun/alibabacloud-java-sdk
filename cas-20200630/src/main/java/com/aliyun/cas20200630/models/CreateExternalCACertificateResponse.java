// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateExternalCACertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExternalCACertificateResponseBody body;

    public static CreateExternalCACertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExternalCACertificateResponse self = new CreateExternalCACertificateResponse();
        return TeaModel.build(map, self);
    }

    public CreateExternalCACertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExternalCACertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExternalCACertificateResponse setBody(CreateExternalCACertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExternalCACertificateResponseBody getBody() {
        return this.body;
    }

}
