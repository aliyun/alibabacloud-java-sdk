// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTransitRouterRouteTablesResponseBody body;

    public static ListTransitRouterRouteTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterRouteTablesResponse self = new ListTransitRouterRouteTablesResponse();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterRouteTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTransitRouterRouteTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTransitRouterRouteTablesResponse setBody(ListTransitRouterRouteTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransitRouterRouteTablesResponseBody getBody() {
        return this.body;
    }

}
