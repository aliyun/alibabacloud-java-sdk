// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DetachPolicySetFromGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachPolicySetFromGatewayResponseBody body;

    public static DetachPolicySetFromGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicySetFromGatewayResponse self = new DetachPolicySetFromGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DetachPolicySetFromGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachPolicySetFromGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachPolicySetFromGatewayResponse setBody(DetachPolicySetFromGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachPolicySetFromGatewayResponseBody getBody() {
        return this.body;
    }

}
