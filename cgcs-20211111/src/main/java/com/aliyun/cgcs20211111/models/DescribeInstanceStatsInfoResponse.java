// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatsInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceStatsInfoResponseBody body;

    public static DescribeInstanceStatsInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStatsInfoResponse self = new DescribeInstanceStatsInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStatsInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceStatsInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceStatsInfoResponse setBody(DescribeInstanceStatsInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceStatsInfoResponseBody getBody() {
        return this.body;
    }

}
