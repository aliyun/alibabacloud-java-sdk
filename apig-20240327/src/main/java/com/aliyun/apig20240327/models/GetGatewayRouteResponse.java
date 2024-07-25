// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGatewayRouteResponseBody body;

    public static GetGatewayRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayRouteResponse self = new GetGatewayRouteResponse();
        return TeaModel.build(map, self);
    }

    public GetGatewayRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGatewayRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGatewayRouteResponse setBody(GetGatewayRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGatewayRouteResponseBody getBody() {
        return this.body;
    }

}
