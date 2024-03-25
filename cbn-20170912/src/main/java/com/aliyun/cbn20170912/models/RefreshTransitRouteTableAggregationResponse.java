// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class RefreshTransitRouteTableAggregationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshTransitRouteTableAggregationResponseBody body;

    public static RefreshTransitRouteTableAggregationResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshTransitRouteTableAggregationResponse self = new RefreshTransitRouteTableAggregationResponse();
        return TeaModel.build(map, self);
    }

    public RefreshTransitRouteTableAggregationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshTransitRouteTableAggregationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshTransitRouteTableAggregationResponse setBody(RefreshTransitRouteTableAggregationResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshTransitRouteTableAggregationResponseBody getBody() {
        return this.body;
    }

}
