// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayWebsocketUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGatewayWebsocketUsageResponseBody body;

    public static GetGatewayWebsocketUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayWebsocketUsageResponse self = new GetGatewayWebsocketUsageResponse();
        return TeaModel.build(map, self);
    }

    public GetGatewayWebsocketUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGatewayWebsocketUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGatewayWebsocketUsageResponse setBody(GetGatewayWebsocketUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGatewayWebsocketUsageResponseBody getBody() {
        return this.body;
    }

}
