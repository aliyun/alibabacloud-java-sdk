// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class RevokeCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeCertificateResponseBody body;

    public static RevokeCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeCertificateResponse self = new RevokeCertificateResponse();
        return TeaModel.build(map, self);
    }

    public RevokeCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeCertificateResponse setBody(RevokeCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeCertificateResponseBody getBody() {
        return this.body;
    }

}
