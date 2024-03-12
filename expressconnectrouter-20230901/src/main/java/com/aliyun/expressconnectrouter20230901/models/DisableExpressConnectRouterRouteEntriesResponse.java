// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DisableExpressConnectRouterRouteEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableExpressConnectRouterRouteEntriesResponseBody body;

    public static DisableExpressConnectRouterRouteEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableExpressConnectRouterRouteEntriesResponse self = new DisableExpressConnectRouterRouteEntriesResponse();
        return TeaModel.build(map, self);
    }

    public DisableExpressConnectRouterRouteEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableExpressConnectRouterRouteEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableExpressConnectRouterRouteEntriesResponse setBody(DisableExpressConnectRouterRouteEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableExpressConnectRouterRouteEntriesResponseBody getBody() {
        return this.body;
    }

}
