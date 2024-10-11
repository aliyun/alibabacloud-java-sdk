// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeUserMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserMetricsResponseBody body;

    public static DescribeUserMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserMetricsResponse self = new DescribeUserMetricsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserMetricsResponse setBody(DescribeUserMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserMetricsResponseBody getBody() {
        return this.body;
    }

}
