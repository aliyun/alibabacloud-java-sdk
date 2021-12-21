// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteTablePropagationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListTransitRouterRouteTablePropagationsResponse setBody(ListTransitRouterRouteTablePropagationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransitRouterRouteTablePropagationsResponseBody getBody() {
        return this.body;
    }

}
