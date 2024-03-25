// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeTransitRouteTableAggregationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTransitRouteTableAggregationResponseBody body;

    public static DescribeTransitRouteTableAggregationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitRouteTableAggregationResponse self = new DescribeTransitRouteTableAggregationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTransitRouteTableAggregationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTransitRouteTableAggregationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTransitRouteTableAggregationResponse setBody(DescribeTransitRouteTableAggregationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTransitRouteTableAggregationResponseBody getBody() {
        return this.body;
    }

}
