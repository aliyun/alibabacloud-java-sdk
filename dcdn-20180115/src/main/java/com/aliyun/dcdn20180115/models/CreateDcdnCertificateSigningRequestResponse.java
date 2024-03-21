// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnCertificateSigningRequestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDcdnCertificateSigningRequestResponseBody body;

    public static CreateDcdnCertificateSigningRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnCertificateSigningRequestResponse self = new CreateDcdnCertificateSigningRequestResponse();
        return TeaModel.build(map, self);
    }

    public CreateDcdnCertificateSigningRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDcdnCertificateSigningRequestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDcdnCertificateSigningRequestResponse setBody(CreateDcdnCertificateSigningRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDcdnCertificateSigningRequestResponseBody getBody() {
        return this.body;
    }

}
