// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouteTableAggregationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTransitRouteTableAggregationResponseBody body;

    public static CreateTransitRouteTableAggregationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouteTableAggregationResponse self = new CreateTransitRouteTableAggregationResponse();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouteTableAggregationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTransitRouteTableAggregationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTransitRouteTableAggregationResponse setBody(CreateTransitRouteTableAggregationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransitRouteTableAggregationResponseBody getBody() {
        return this.body;
    }

}
