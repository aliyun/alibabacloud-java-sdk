// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class AttachPolicySetToGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachPolicySetToGatewayResponseBody body;

    public static AttachPolicySetToGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicySetToGatewayResponse self = new AttachPolicySetToGatewayResponse();
        return TeaModel.build(map, self);
    }

    public AttachPolicySetToGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachPolicySetToGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachPolicySetToGatewayResponse setBody(AttachPolicySetToGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachPolicySetToGatewayResponseBody getBody() {
        return this.body;
    }

}
