// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayRouteOnAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayRouteOnAuthResponseBody body;

    public static ListGatewayRouteOnAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayRouteOnAuthResponse self = new ListGatewayRouteOnAuthResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayRouteOnAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayRouteOnAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayRouteOnAuthResponse setBody(ListGatewayRouteOnAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayRouteOnAuthResponseBody getBody() {
        return this.body;
    }

}
