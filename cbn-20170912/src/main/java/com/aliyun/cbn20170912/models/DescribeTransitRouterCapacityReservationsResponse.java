// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeTransitRouterCapacityReservationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTransitRouterCapacityReservationsResponseBody body;

    public static DescribeTransitRouterCapacityReservationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitRouterCapacityReservationsResponse self = new DescribeTransitRouterCapacityReservationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTransitRouterCapacityReservationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTransitRouterCapacityReservationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTransitRouterCapacityReservationsResponse setBody(DescribeTransitRouterCapacityReservationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTransitRouterCapacityReservationsResponseBody getBody() {
        return this.body;
    }

}
