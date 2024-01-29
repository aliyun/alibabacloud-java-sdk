// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteHeaderOpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayRouteHeaderOpResponseBody body;

    public static UpdateGatewayRouteHeaderOpResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteHeaderOpResponse self = new UpdateGatewayRouteHeaderOpResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteHeaderOpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayRouteHeaderOpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayRouteHeaderOpResponse setBody(UpdateGatewayRouteHeaderOpResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayRouteHeaderOpResponseBody getBody() {
        return this.body;
    }

}
