// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteHTTPRewriteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGatewayRouteHTTPRewriteResponseBody body;

    public static UpdateGatewayRouteHTTPRewriteResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteHTTPRewriteResponse self = new UpdateGatewayRouteHTTPRewriteResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteHTTPRewriteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayRouteHTTPRewriteResponse setBody(UpdateGatewayRouteHTTPRewriteResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayRouteHTTPRewriteResponseBody getBody() {
        return this.body;
    }

}
