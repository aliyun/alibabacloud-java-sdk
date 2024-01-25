// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateRevokeClientCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRevokeClientCertificateResponseBody body;

    public static CreateRevokeClientCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRevokeClientCertificateResponse self = new CreateRevokeClientCertificateResponse();
        return TeaModel.build(map, self);
    }

    public CreateRevokeClientCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRevokeClientCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRevokeClientCertificateResponse setBody(CreateRevokeClientCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRevokeClientCertificateResponseBody getBody() {
        return this.body;
    }

}
