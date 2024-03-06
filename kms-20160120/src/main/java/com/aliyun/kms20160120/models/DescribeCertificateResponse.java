// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCertificateResponseBody body;

    public static DescribeCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificateResponse self = new DescribeCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCertificateResponse setBody(DescribeCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCertificateResponseBody getBody() {
        return this.body;
    }

}
