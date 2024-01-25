// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateClientCertificateWithCsrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateClientCertificateWithCsrResponseBody body;

    public static CreateClientCertificateWithCsrResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClientCertificateWithCsrResponse self = new CreateClientCertificateWithCsrResponse();
        return TeaModel.build(map, self);
    }

    public CreateClientCertificateWithCsrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClientCertificateWithCsrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateClientCertificateWithCsrResponse setBody(CreateClientCertificateWithCsrResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClientCertificateWithCsrResponseBody getBody() {
        return this.body;
    }

}
