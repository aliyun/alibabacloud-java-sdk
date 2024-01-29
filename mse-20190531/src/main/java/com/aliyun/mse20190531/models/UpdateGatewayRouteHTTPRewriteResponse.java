// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteHTTPRewriteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateGatewayRouteHTTPRewriteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayRouteHTTPRewriteResponse setBody(UpdateGatewayRouteHTTPRewriteResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayRouteHTTPRewriteResponseBody getBody() {
        return this.body;
    }

}
