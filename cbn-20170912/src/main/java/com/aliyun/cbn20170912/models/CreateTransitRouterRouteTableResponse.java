// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterRouteTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTransitRouterRouteTableResponseBody body;

    public static CreateTransitRouterRouteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterRouteTableResponse self = new CreateTransitRouterRouteTableResponse();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterRouteTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTransitRouterRouteTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTransitRouterRouteTableResponse setBody(CreateTransitRouterRouteTableResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransitRouterRouteTableResponseBody getBody() {
        return this.body;
    }

}
