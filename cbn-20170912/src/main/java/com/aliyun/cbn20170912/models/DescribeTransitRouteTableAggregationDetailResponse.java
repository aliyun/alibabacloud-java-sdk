// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeTransitRouteTableAggregationDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTransitRouteTableAggregationDetailResponseBody body;

    public static DescribeTransitRouteTableAggregationDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitRouteTableAggregationDetailResponse self = new DescribeTransitRouteTableAggregationDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTransitRouteTableAggregationDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTransitRouteTableAggregationDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTransitRouteTableAggregationDetailResponse setBody(DescribeTransitRouteTableAggregationDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTransitRouteTableAggregationDetailResponseBody getBody() {
        return this.body;
    }

}
