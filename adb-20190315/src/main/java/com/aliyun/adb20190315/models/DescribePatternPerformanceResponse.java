// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribePatternPerformanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePatternPerformanceResponseBody body;

    public static DescribePatternPerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePatternPerformanceResponse self = new DescribePatternPerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribePatternPerformanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePatternPerformanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePatternPerformanceResponse setBody(DescribePatternPerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePatternPerformanceResponseBody getBody() {
        return this.body;
    }

}
