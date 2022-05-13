// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ApplyGatewayRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyGatewayRouteResponseBody body;

    public static ApplyGatewayRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyGatewayRouteResponse self = new ApplyGatewayRouteResponse();
        return TeaModel.build(map, self);
    }

    public ApplyGatewayRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyGatewayRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyGatewayRouteResponse setBody(ApplyGatewayRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyGatewayRouteResponseBody getBody() {
        return this.body;
    }

}
