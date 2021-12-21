// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterRouteTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteTransitRouterRouteTableResponse setBody(DeleteTransitRouterRouteTableResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTransitRouterRouteTableResponseBody getBody() {
        return this.body;
    }

}
