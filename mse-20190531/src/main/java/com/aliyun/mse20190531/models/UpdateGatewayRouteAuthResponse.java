// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteAuthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGatewayRouteAuthResponseBody body;

    public static UpdateGatewayRouteAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteAuthResponse self = new UpdateGatewayRouteAuthResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayRouteAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayRouteAuthResponse setBody(UpdateGatewayRouteAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayRouteAuthResponseBody getBody() {
        return this.body;
    }

}
