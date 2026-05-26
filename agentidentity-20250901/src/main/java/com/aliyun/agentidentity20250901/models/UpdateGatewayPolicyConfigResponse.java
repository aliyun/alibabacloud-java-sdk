// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateGatewayPolicyConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayPolicyConfigResponseBody body;

    public static UpdateGatewayPolicyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayPolicyConfigResponse self = new UpdateGatewayPolicyConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayPolicyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayPolicyConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayPolicyConfigResponse setBody(UpdateGatewayPolicyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayPolicyConfigResponseBody getBody() {
        return this.body;
    }

}
