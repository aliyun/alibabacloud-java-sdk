// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateRootCACertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateRootCACertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRootCACertificateResponse setBody(CreateRootCACertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRootCACertificateResponseBody getBody() {
        return this.body;
    }

}
