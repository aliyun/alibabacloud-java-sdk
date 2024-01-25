// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeCACertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCACertificateResponseBody body;

    public static DescribeCACertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCACertificateResponse self = new DescribeCACertificateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCACertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCACertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCACertificateResponse setBody(DescribeCACertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCACertificateResponseBody getBody() {
        return this.body;
    }

}
