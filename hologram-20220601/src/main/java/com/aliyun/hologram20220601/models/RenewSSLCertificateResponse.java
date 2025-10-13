// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class RenewSSLCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewSSLCertificateResponseBody body;

    public static RenewSSLCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewSSLCertificateResponse self = new RenewSSLCertificateResponse();
        return TeaModel.build(map, self);
    }

    public RenewSSLCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewSSLCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewSSLCertificateResponse setBody(RenewSSLCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewSSLCertificateResponseBody getBody() {
        return this.body;
    }

}
