// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteTimeoutResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateGatewayRouteTimeoutResponse setBody(UpdateGatewayRouteTimeoutResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayRouteTimeoutResponseBody getBody() {
        return this.body;
    }

}
