// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DisableTransitRouterRouteTablePropagationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableTransitRouterRouteTablePropagationResponseBody body;

    public static DisableTransitRouterRouteTablePropagationResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableTransitRouterRouteTablePropagationResponse self = new DisableTransitRouterRouteTablePropagationResponse();
        return TeaModel.build(map, self);
    }

    public DisableTransitRouterRouteTablePropagationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableTransitRouterRouteTablePropagationResponse setBody(DisableTransitRouterRouteTablePropagationResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableTransitRouterRouteTablePropagationResponseBody getBody() {
        return this.body;
    }

}
