// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterPolicyBasedRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTransitRouterPolicyBasedRouteResponseBody body;

    public static CreateTransitRouterPolicyBasedRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterPolicyBasedRouteResponse self = new CreateTransitRouterPolicyBasedRouteResponse();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterPolicyBasedRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTransitRouterPolicyBasedRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTransitRouterPolicyBasedRouteResponse setBody(CreateTransitRouterPolicyBasedRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransitRouterPolicyBasedRouteResponseBody getBody() {
        return this.body;
    }

}
