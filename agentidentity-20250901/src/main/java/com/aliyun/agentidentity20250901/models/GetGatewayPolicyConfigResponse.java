// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetGatewayPolicyConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGatewayPolicyConfigResponseBody body;

    public static GetGatewayPolicyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayPolicyConfigResponse self = new GetGatewayPolicyConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetGatewayPolicyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGatewayPolicyConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGatewayPolicyConfigResponse setBody(GetGatewayPolicyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGatewayPolicyConfigResponseBody getBody() {
        return this.body;
    }

}
