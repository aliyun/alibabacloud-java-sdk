// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteEntriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListTransitRouterRouteEntriesResponse setBody(ListTransitRouterRouteEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransitRouterRouteEntriesResponseBody getBody() {
        return this.body;
    }

}
