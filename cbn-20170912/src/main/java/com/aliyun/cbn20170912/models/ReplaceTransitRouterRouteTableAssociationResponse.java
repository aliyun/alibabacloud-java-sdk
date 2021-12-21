// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ReplaceTransitRouterRouteTableAssociationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReplaceTransitRouterRouteTableAssociationResponseBody body;

    public static ReplaceTransitRouterRouteTableAssociationResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceTransitRouterRouteTableAssociationResponse self = new ReplaceTransitRouterRouteTableAssociationResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceTransitRouterRouteTableAssociationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceTransitRouterRouteTableAssociationResponse setBody(ReplaceTransitRouterRouteTableAssociationResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceTransitRouterRouteTableAssociationResponseBody getBody() {
        return this.body;
    }

}
