// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHealthCheckStatusResponseBody body;

    public static DescribeHealthCheckStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthCheckStatusResponse self = new DescribeHealthCheckStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHealthCheckStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHealthCheckStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHealthCheckStatusResponse setBody(DescribeHealthCheckStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHealthCheckStatusResponseBody getBody() {
        return this.body;
    }

}
