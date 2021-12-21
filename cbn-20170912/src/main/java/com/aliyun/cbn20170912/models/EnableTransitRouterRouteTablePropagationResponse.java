// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class EnableTransitRouterRouteTablePropagationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableTransitRouterRouteTablePropagationResponseBody body;

    public static EnableTransitRouterRouteTablePropagationResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableTransitRouterRouteTablePropagationResponse self = new EnableTransitRouterRouteTablePropagationResponse();
        return TeaModel.build(map, self);
    }

    public EnableTransitRouterRouteTablePropagationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableTransitRouterRouteTablePropagationResponse setBody(EnableTransitRouterRouteTablePropagationResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableTransitRouterRouteTablePropagationResponseBody getBody() {
        return this.body;
    }

}
