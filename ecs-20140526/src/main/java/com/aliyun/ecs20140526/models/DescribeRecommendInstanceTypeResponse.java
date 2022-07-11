// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRecommendInstanceTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRecommendInstanceTypeResponseBody body;

    public static DescribeRecommendInstanceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecommendInstanceTypeResponse self = new DescribeRecommendInstanceTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecommendInstanceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecommendInstanceTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRecommendInstanceTypeResponse setBody(DescribeRecommendInstanceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecommendInstanceTypeResponseBody getBody() {
        return this.body;
    }

}
