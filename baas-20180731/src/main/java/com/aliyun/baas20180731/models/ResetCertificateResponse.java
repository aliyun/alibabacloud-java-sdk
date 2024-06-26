// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ResetCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetCertificateResponseBody body;

    public static ResetCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetCertificateResponse self = new ResetCertificateResponse();
        return TeaModel.build(map, self);
    }

    public ResetCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetCertificateResponse setBody(ResetCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetCertificateResponseBody getBody() {
        return this.body;
    }

}
