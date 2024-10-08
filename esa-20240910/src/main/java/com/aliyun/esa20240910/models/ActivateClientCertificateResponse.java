// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ActivateClientCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ActivateClientCertificateResponseBody body;

    public static ActivateClientCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateClientCertificateResponse self = new ActivateClientCertificateResponse();
        return TeaModel.build(map, self);
    }

    public ActivateClientCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateClientCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActivateClientCertificateResponse setBody(ActivateClientCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivateClientCertificateResponseBody getBody() {
        return this.body;
    }

}
