// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCertificateForPackageRequestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCertificateForPackageRequestResponseBody body;

    public static CreateCertificateForPackageRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateForPackageRequestResponse self = new CreateCertificateForPackageRequestResponse();
        return TeaModel.build(map, self);
    }

    public CreateCertificateForPackageRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCertificateForPackageRequestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCertificateForPackageRequestResponse setBody(CreateCertificateForPackageRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCertificateForPackageRequestResponseBody getBody() {
        return this.body;
    }

}
