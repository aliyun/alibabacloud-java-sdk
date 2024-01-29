// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayRouteResponseBody body;

    public static UpdateGatewayRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteResponse self = new UpdateGatewayRouteResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayRouteResponse setBody(UpdateGatewayRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayRouteResponseBody getBody() {
        return this.body;
    }

}
