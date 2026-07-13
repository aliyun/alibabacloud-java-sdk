// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetNatGatewayStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNatGatewayStatusResponseBody body;

    public static GetNatGatewayStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNatGatewayStatusResponse self = new GetNatGatewayStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetNatGatewayStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNatGatewayStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNatGatewayStatusResponse setBody(GetNatGatewayStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNatGatewayStatusResponseBody getBody() {
        return this.body;
    }

}
