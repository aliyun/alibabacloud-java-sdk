// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteTablePropagationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTransitRouterRouteTablePropagationsResponseBody body;

    public static ListTransitRouterRouteTablePropagationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterRouteTablePropagationsResponse self = new ListTransitRouterRouteTablePropagationsResponse();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterRouteTablePropagationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTransitRouterRouteTablePropagationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTransitRouterRouteTablePropagationsResponse setBody(ListTransitRouterRouteTablePropagationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransitRouterRouteTablePropagationsResponseBody getBody() {
        return this.body;
    }

}
