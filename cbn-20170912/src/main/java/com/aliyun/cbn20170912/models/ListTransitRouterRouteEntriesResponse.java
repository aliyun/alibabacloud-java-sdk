// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTransitRouterRouteEntriesResponseBody body;

    public static ListTransitRouterRouteEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterRouteEntriesResponse self = new ListTransitRouterRouteEntriesResponse();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterRouteEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTransitRouterRouteEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTransitRouterRouteEntriesResponse setBody(ListTransitRouterRouteEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransitRouterRouteEntriesResponseBody getBody() {
        return this.body;
    }

}
