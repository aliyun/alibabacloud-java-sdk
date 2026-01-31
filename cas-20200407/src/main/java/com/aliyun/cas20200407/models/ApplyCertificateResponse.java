// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ApplyCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyCertificateResponseBody body;

    public static ApplyCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyCertificateResponse self = new ApplyCertificateResponse();
        return TeaModel.build(map, self);
    }

    public ApplyCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyCertificateResponse setBody(ApplyCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyCertificateResponseBody getBody() {
        return this.body;
    }

}
