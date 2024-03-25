// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ReplaceTransitRouterRouteTableAssociationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ReplaceTransitRouterRouteTableAssociationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReplaceTransitRouterRouteTableAssociationResponse setBody(ReplaceTransitRouterRouteTableAssociationResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceTransitRouterRouteTableAssociationResponseBody getBody() {
        return this.body;
    }

}
