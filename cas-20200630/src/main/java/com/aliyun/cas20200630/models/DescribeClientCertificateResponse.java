// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeClientCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClientCertificateResponseBody body;

    public static DescribeClientCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientCertificateResponse self = new DescribeClientCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClientCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClientCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClientCertificateResponse setBody(DescribeClientCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClientCertificateResponseBody getBody() {
        return this.body;
    }

}
