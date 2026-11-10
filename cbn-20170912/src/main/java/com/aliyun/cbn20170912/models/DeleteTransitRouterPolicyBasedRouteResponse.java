// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterPolicyBasedRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTransitRouterPolicyBasedRouteResponseBody body;

    public static DeleteTransitRouterPolicyBasedRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterPolicyBasedRouteResponse self = new DeleteTransitRouterPolicyBasedRouteResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterPolicyBasedRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTransitRouterPolicyBasedRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTransitRouterPolicyBasedRouteResponse setBody(DeleteTransitRouterPolicyBasedRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTransitRouterPolicyBasedRouteResponseBody getBody() {
        return this.body;
    }

}
