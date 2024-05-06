// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionPerformanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSubscriptionPerformanceResponseBody body;

    public static DescribeSubscriptionPerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionPerformanceResponse self = new DescribeSubscriptionPerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionPerformanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSubscriptionPerformanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSubscriptionPerformanceResponse setBody(DescribeSubscriptionPerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSubscriptionPerformanceResponseBody getBody() {
        return this.body;
    }

}
