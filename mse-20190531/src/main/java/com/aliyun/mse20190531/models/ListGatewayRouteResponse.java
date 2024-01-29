// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayRouteResponseBody body;

    public static ListGatewayRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayRouteResponse self = new ListGatewayRouteResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayRouteResponse setBody(ListGatewayRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayRouteResponseBody getBody() {
        return this.body;
    }

}
