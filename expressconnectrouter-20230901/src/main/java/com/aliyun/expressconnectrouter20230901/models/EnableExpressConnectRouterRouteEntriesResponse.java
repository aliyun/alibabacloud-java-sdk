// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class EnableExpressConnectRouterRouteEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableExpressConnectRouterRouteEntriesResponseBody body;

    public static EnableExpressConnectRouterRouteEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableExpressConnectRouterRouteEntriesResponse self = new EnableExpressConnectRouterRouteEntriesResponse();
        return TeaModel.build(map, self);
    }

    public EnableExpressConnectRouterRouteEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableExpressConnectRouterRouteEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableExpressConnectRouterRouteEntriesResponse setBody(EnableExpressConnectRouterRouteEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableExpressConnectRouterRouteEntriesResponseBody getBody() {
        return this.body;
    }

}
