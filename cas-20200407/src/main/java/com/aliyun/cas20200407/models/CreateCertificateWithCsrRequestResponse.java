// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCertificateWithCsrRequestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCertificateWithCsrRequestResponseBody body;

    public static CreateCertificateWithCsrRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateWithCsrRequestResponse self = new CreateCertificateWithCsrRequestResponse();
        return TeaModel.build(map, self);
    }

    public CreateCertificateWithCsrRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCertificateWithCsrRequestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCertificateWithCsrRequestResponse setBody(CreateCertificateWithCsrRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCertificateWithCsrRequestResponseBody getBody() {
        return this.body;
    }

}
