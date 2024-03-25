// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouteTableAggregationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTransitRouteTableAggregationResponseBody body;

    public static DeleteTransitRouteTableAggregationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouteTableAggregationResponse self = new DeleteTransitRouteTableAggregationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouteTableAggregationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTransitRouteTableAggregationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTransitRouteTableAggregationResponse setBody(DeleteTransitRouteTableAggregationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTransitRouteTableAggregationResponseBody getBody() {
        return this.body;
    }

}
