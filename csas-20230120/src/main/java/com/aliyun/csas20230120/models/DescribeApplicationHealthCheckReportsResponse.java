// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DescribeApplicationHealthCheckReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationHealthCheckReportsResponseBody body;

    public static DescribeApplicationHealthCheckReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationHealthCheckReportsResponse self = new DescribeApplicationHealthCheckReportsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationHealthCheckReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationHealthCheckReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationHealthCheckReportsResponse setBody(DescribeApplicationHealthCheckReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationHealthCheckReportsResponseBody getBody() {
        return this.body;
    }

}
