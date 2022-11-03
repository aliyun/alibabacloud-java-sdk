// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class RevokeWHClientCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RevokeWHClientCertificateResponseBody body;

    public static RevokeWHClientCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeWHClientCertificateResponse self = new RevokeWHClientCertificateResponse();
        return TeaModel.build(map, self);
    }

    public RevokeWHClientCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeWHClientCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeWHClientCertificateResponse setBody(RevokeWHClientCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeWHClientCertificateResponseBody getBody() {
        return this.body;
    }

}
