// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterRouteTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateTransitRouterRouteTableResponse setBody(CreateTransitRouterRouteTableResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransitRouterRouteTableResponseBody getBody() {
        return this.body;
    }

}
