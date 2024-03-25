// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTransitRouterRouteEntryResponseBody body;

    public static CreateTransitRouterRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterRouteEntryResponse self = new CreateTransitRouterRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterRouteEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTransitRouterRouteEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTransitRouterRouteEntryResponse setBody(CreateTransitRouterRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransitRouterRouteEntryResponseBody getBody() {
        return this.body;
    }

}
