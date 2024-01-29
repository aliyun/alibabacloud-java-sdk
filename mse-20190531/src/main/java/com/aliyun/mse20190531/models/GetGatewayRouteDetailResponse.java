// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayRouteDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGatewayRouteDetailResponseBody body;

    public static GetGatewayRouteDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayRouteDetailResponse self = new GetGatewayRouteDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetGatewayRouteDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGatewayRouteDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGatewayRouteDetailResponse setBody(GetGatewayRouteDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGatewayRouteDetailResponseBody getBody() {
        return this.body;
    }

}
