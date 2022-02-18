// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddGatewayRouteResponse setBody(AddGatewayRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGatewayRouteResponseBody getBody() {
        return this.body;
    }

}
