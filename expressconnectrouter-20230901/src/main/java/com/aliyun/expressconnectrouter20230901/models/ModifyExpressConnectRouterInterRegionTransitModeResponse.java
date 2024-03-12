// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class ModifyExpressConnectRouterInterRegionTransitModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyExpressConnectRouterInterRegionTransitModeResponseBody body;

    public static ModifyExpressConnectRouterInterRegionTransitModeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressConnectRouterInterRegionTransitModeResponse self = new ModifyExpressConnectRouterInterRegionTransitModeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyExpressConnectRouterInterRegionTransitModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyExpressConnectRouterInterRegionTransitModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyExpressConnectRouterInterRegionTransitModeResponse setBody(ModifyExpressConnectRouterInterRegionTransitModeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyExpressConnectRouterInterRegionTransitModeResponseBody getBody() {
        return this.body;
    }

}
