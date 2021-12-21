// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class RenewCertificateOrderForPackageRequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RenewCertificateOrderForPackageRequestResponse setBody(RenewCertificateOrderForPackageRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewCertificateOrderForPackageRequestResponseBody getBody() {
        return this.body;
    }

}
