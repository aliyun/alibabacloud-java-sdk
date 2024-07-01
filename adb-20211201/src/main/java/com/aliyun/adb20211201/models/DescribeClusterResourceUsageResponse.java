// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeClusterResourceUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterResourceUsageResponseBody body;

    public static DescribeClusterResourceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterResourceUsageResponse self = new DescribeClusterResourceUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterResourceUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterResourceUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterResourceUsageResponse setBody(DescribeClusterResourceUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterResourceUsageResponseBody getBody() {
        return this.body;
    }

}
