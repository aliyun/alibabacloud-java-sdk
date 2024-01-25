// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeCACertificateCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCACertificateCountResponseBody body;

    public static DescribeCACertificateCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCACertificateCountResponse self = new DescribeCACertificateCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCACertificateCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCACertificateCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCACertificateCountResponse setBody(DescribeCACertificateCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCACertificateCountResponseBody getBody() {
        return this.body;
    }

}
