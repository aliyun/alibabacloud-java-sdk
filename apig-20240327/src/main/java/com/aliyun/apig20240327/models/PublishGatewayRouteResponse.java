// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class PublishGatewayRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishGatewayRouteResponseBody body;

    public static PublishGatewayRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishGatewayRouteResponse self = new PublishGatewayRouteResponse();
        return TeaModel.build(map, self);
    }

    public PublishGatewayRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishGatewayRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishGatewayRouteResponse setBody(PublishGatewayRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishGatewayRouteResponseBody getBody() {
        return this.body;
    }

}
