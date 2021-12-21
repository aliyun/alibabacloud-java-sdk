// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteTransitRouterRouteEntryResponse setBody(DeleteTransitRouterRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTransitRouterRouteEntryResponseBody getBody() {
        return this.body;
    }

}
