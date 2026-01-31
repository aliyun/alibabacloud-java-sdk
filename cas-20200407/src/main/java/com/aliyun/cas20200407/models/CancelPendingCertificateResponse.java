// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CancelPendingCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelPendingCertificateResponseBody body;

    public static CancelPendingCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelPendingCertificateResponse self = new CancelPendingCertificateResponse();
        return TeaModel.build(map, self);
    }

    public CancelPendingCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelPendingCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelPendingCertificateResponse setBody(CancelPendingCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelPendingCertificateResponseBody getBody() {
        return this.body;
    }

}
