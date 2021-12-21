// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CancelCertificateForPackageRequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CancelCertificateForPackageRequestResponse setBody(CancelCertificateForPackageRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelCertificateForPackageRequestResponseBody getBody() {
        return this.body;
    }

}
