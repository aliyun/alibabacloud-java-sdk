// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CancelCertificateForPackageRequestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelCertificateForPackageRequestResponseBody body;

    public static CancelCertificateForPackageRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelCertificateForPackageRequestResponse self = new CancelCertificateForPackageRequestResponse();
        return TeaModel.build(map, self);
    }

    public CancelCertificateForPackageRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelCertificateForPackageRequestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelCertificateForPackageRequestResponse setBody(CancelCertificateForPackageRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelCertificateForPackageRequestResponseBody getBody() {
        return this.body;
    }

}
