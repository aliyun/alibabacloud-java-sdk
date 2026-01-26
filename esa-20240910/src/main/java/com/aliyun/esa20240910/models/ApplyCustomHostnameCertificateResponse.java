// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ApplyCustomHostnameCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyCustomHostnameCertificateResponseBody body;

    public static ApplyCustomHostnameCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyCustomHostnameCertificateResponse self = new ApplyCustomHostnameCertificateResponse();
        return TeaModel.build(map, self);
    }

    public ApplyCustomHostnameCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyCustomHostnameCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyCustomHostnameCertificateResponse setBody(ApplyCustomHostnameCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyCustomHostnameCertificateResponseBody getBody() {
        return this.body;
    }

}
