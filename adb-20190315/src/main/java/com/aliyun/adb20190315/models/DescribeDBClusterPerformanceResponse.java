// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterPerformanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterPerformanceResponseBody body;

    public static DescribeDBClusterPerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterPerformanceResponse self = new DescribeDBClusterPerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterPerformanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterPerformanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterPerformanceResponse setBody(DescribeDBClusterPerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterPerformanceResponseBody getBody() {
        return this.body;
    }

}
