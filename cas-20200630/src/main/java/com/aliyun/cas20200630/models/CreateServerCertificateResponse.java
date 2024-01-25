// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateServerCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateServerCertificateResponseBody body;

    public static CreateServerCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServerCertificateResponse self = new CreateServerCertificateResponse();
        return TeaModel.build(map, self);
    }

    public CreateServerCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServerCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServerCertificateResponse setBody(CreateServerCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServerCertificateResponseBody getBody() {
        return this.body;
    }

}
