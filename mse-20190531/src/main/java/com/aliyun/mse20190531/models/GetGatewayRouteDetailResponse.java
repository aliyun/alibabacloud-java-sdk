// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayRouteDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetGatewayRouteDetailResponse setBody(GetGatewayRouteDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGatewayRouteDetailResponseBody getBody() {
        return this.body;
    }

}
