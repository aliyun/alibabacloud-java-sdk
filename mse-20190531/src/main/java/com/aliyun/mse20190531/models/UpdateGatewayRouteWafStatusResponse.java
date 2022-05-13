// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteWafStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGatewayRouteWafStatusResponseBody body;

    public static UpdateGatewayRouteWafStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteWafStatusResponse self = new UpdateGatewayRouteWafStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteWafStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayRouteWafStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayRouteWafStatusResponse setBody(UpdateGatewayRouteWafStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayRouteWafStatusResponseBody getBody() {
        return this.body;
    }

}
