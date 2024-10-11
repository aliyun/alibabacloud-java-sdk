// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeSceneThroughputResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSceneThroughputResponseBody body;

    public static DescribeSceneThroughputResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneThroughputResponse self = new DescribeSceneThroughputResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSceneThroughputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSceneThroughputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSceneThroughputResponse setBody(DescribeSceneThroughputResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSceneThroughputResponseBody getBody() {
        return this.body;
    }

}
