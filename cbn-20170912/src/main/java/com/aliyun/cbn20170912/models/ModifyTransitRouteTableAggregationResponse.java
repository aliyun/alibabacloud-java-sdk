// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyTransitRouteTableAggregationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTransitRouteTableAggregationResponseBody body;

    public static ModifyTransitRouteTableAggregationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTransitRouteTableAggregationResponse self = new ModifyTransitRouteTableAggregationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTransitRouteTableAggregationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTransitRouteTableAggregationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTransitRouteTableAggregationResponse setBody(ModifyTransitRouteTableAggregationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTransitRouteTableAggregationResponseBody getBody() {
        return this.body;
    }

}
