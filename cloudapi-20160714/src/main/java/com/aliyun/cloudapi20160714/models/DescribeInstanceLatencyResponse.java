// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceLatencyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceLatencyResponseBody body;

    public static DescribeInstanceLatencyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceLatencyResponse self = new DescribeInstanceLatencyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceLatencyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceLatencyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceLatencyResponse setBody(DescribeInstanceLatencyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceLatencyResponseBody getBody() {
        return this.body;
    }

}
