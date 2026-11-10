// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterPolicyBasedRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTransitRouterPolicyBasedRouteResponseBody body;

    public static UpdateTransitRouterPolicyBasedRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterPolicyBasedRouteResponse self = new UpdateTransitRouterPolicyBasedRouteResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterPolicyBasedRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTransitRouterPolicyBasedRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTransitRouterPolicyBasedRouteResponse setBody(UpdateTransitRouterPolicyBasedRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTransitRouterPolicyBasedRouteResponseBody getBody() {
        return this.body;
    }

}
