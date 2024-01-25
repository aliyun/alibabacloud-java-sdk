// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateClientCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateClientCertificateResponseBody body;

    public static CreateClientCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClientCertificateResponse self = new CreateClientCertificateResponse();
        return TeaModel.build(map, self);
    }

    public CreateClientCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClientCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateClientCertificateResponse setBody(CreateClientCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClientCertificateResponseBody getBody() {
        return this.body;
    }

}
