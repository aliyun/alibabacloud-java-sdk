// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class RevokeClientCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeClientCertificateResponseBody body;

    public static RevokeClientCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeClientCertificateResponse self = new RevokeClientCertificateResponse();
        return TeaModel.build(map, self);
    }

    public RevokeClientCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeClientCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeClientCertificateResponse setBody(RevokeClientCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeClientCertificateResponseBody getBody() {
        return this.body;
    }

}
