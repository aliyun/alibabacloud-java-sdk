// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeResourceAggregationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeResourceAggregationsResponseBody body;

    public static DescribeResourceAggregationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceAggregationsResponse self = new DescribeResourceAggregationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceAggregationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceAggregationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceAggregationsResponse setBody(DescribeResourceAggregationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceAggregationsResponseBody getBody() {
        return this.body;
    }

}
