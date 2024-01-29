// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteRetryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayRouteRetryResponseBody body;

    public static UpdateGatewayRouteRetryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteRetryResponse self = new UpdateGatewayRouteRetryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteRetryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayRouteRetryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayRouteRetryResponse setBody(UpdateGatewayRouteRetryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayRouteRetryResponseBody getBody() {
        return this.body;
    }

}
