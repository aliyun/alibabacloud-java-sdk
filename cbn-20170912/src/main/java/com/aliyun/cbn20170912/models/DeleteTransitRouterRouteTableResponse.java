// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterRouteTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTransitRouterRouteTableResponseBody body;

    public static DeleteTransitRouterRouteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterRouteTableResponse self = new DeleteTransitRouterRouteTableResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterRouteTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTransitRouterRouteTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTransitRouterRouteTableResponse setBody(DeleteTransitRouterRouteTableResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTransitRouterRouteTableResponseBody getBody() {
        return this.body;
    }

}
