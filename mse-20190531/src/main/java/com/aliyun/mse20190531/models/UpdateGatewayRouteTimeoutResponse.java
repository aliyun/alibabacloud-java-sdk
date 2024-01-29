// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteTimeoutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayRouteTimeoutResponseBody body;

    public static UpdateGatewayRouteTimeoutResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteTimeoutResponse self = new UpdateGatewayRouteTimeoutResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteTimeoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayRouteTimeoutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayRouteTimeoutResponse setBody(UpdateGatewayRouteTimeoutResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayRouteTimeoutResponseBody getBody() {
        return this.body;
    }

}
