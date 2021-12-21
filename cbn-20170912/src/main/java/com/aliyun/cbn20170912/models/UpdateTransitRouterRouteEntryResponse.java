// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTransitRouterRouteEntryResponseBody body;

    public static UpdateTransitRouterRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterRouteEntryResponse self = new UpdateTransitRouterRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterRouteEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTransitRouterRouteEntryResponse setBody(UpdateTransitRouterRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTransitRouterRouteEntryResponseBody getBody() {
        return this.body;
    }

}
