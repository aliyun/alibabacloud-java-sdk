// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateWHClientCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWHClientCertificateResponseBody body;

    public static CreateWHClientCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWHClientCertificateResponse self = new CreateWHClientCertificateResponse();
        return TeaModel.build(map, self);
    }

    public CreateWHClientCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWHClientCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWHClientCertificateResponse setBody(CreateWHClientCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWHClientCertificateResponseBody getBody() {
        return this.body;
    }

}
