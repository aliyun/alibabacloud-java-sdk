// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteTableAssociationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTransitRouterRouteTableAssociationsResponseBody body;

    public static ListTransitRouterRouteTableAssociationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterRouteTableAssociationsResponse self = new ListTransitRouterRouteTableAssociationsResponse();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterRouteTableAssociationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTransitRouterRouteTableAssociationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTransitRouterRouteTableAssociationsResponse setBody(ListTransitRouterRouteTableAssociationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransitRouterRouteTableAssociationsResponseBody getBody() {
        return this.body;
    }

}
