// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddGatewayRouteResponseBody body;

    public static AddGatewayRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGatewayRouteResponse self = new AddGatewayRouteResponse();
        return TeaModel.build(map, self);
    }

    public AddGatewayRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGatewayRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddGatewayRouteResponse setBody(AddGatewayRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGatewayRouteResponseBody getBody() {
        return this.body;
    }

}
