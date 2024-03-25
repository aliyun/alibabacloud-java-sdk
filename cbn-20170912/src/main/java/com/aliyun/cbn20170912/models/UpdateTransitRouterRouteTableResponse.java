// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterRouteTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTransitRouterRouteTableResponseBody body;

    public static UpdateTransitRouterRouteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterRouteTableResponse self = new UpdateTransitRouterRouteTableResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterRouteTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTransitRouterRouteTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTransitRouterRouteTableResponse setBody(UpdateTransitRouterRouteTableResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTransitRouterRouteTableResponseBody getBody() {
        return this.body;
    }

}
