// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTransitRouterRouteEntryResponseBody body;

    public static DeleteTransitRouterRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterRouteEntryResponse self = new DeleteTransitRouterRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterRouteEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTransitRouterRouteEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTransitRouterRouteEntryResponse setBody(DeleteTransitRouterRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTransitRouterRouteEntryResponseBody getBody() {
        return this.body;
    }

}
