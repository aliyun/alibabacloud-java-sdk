// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateSubCACertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateSubCACertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSubCACertificateResponse setBody(CreateSubCACertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSubCACertificateResponseBody getBody() {
        return this.body;
    }

}
