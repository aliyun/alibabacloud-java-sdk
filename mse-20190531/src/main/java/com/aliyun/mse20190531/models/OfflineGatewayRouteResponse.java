// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class OfflineGatewayRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OfflineGatewayRouteResponseBody body;

    public static OfflineGatewayRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineGatewayRouteResponse self = new OfflineGatewayRouteResponse();
        return TeaModel.build(map, self);
    }

    public OfflineGatewayRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineGatewayRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OfflineGatewayRouteResponse setBody(OfflineGatewayRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineGatewayRouteResponseBody getBody() {
        return this.body;
    }

}
