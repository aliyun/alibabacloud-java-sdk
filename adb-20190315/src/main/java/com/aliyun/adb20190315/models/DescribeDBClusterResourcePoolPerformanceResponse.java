// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterResourcePoolPerformanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterResourcePoolPerformanceResponseBody body;

    public static DescribeDBClusterResourcePoolPerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterResourcePoolPerformanceResponse self = new DescribeDBClusterResourcePoolPerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterResourcePoolPerformanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterResourcePoolPerformanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterResourcePoolPerformanceResponse setBody(DescribeDBClusterResourcePoolPerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterResourcePoolPerformanceResponseBody getBody() {
        return this.body;
    }

}
