// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteHeaderOpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateGatewayRouteHeaderOpResponse setBody(UpdateGatewayRouteHeaderOpResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayRouteHeaderOpResponseBody getBody() {
        return this.body;
    }

}
