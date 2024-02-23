// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class RenewCertificateOrderForPackageRequestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewCertificateOrderForPackageRequestResponseBody body;

    public static RenewCertificateOrderForPackageRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewCertificateOrderForPackageRequestResponse self = new RenewCertificateOrderForPackageRequestResponse();
        return TeaModel.build(map, self);
    }

    public RenewCertificateOrderForPackageRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewCertificateOrderForPackageRequestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewCertificateOrderForPackageRequestResponse setBody(RenewCertificateOrderForPackageRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewCertificateOrderForPackageRequestResponseBody getBody() {
        return this.body;
    }

}
