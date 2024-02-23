// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeCertificateStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCertificateStateResponseBody body;

    public static DescribeCertificateStateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificateStateResponse self = new DescribeCertificateStateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCertificateStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCertificateStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCertificateStateResponse setBody(DescribeCertificateStateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCertificateStateResponseBody getBody() {
        return this.body;
    }

}
