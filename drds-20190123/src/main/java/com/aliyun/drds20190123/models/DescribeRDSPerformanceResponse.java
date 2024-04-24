// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRDSPerformanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRDSPerformanceResponseBody body;

    public static DescribeRDSPerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRDSPerformanceResponse self = new DescribeRDSPerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRDSPerformanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRDSPerformanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRDSPerformanceResponse setBody(DescribeRDSPerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRDSPerformanceResponseBody getBody() {
        return this.body;
    }

}
