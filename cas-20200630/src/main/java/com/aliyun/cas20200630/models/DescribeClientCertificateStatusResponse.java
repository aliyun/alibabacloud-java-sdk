// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeClientCertificateStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClientCertificateStatusResponseBody body;

    public static DescribeClientCertificateStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientCertificateStatusResponse self = new DescribeClientCertificateStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClientCertificateStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClientCertificateStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClientCertificateStatusResponse setBody(DescribeClientCertificateStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClientCertificateStatusResponseBody getBody() {
        return this.body;
    }

}
