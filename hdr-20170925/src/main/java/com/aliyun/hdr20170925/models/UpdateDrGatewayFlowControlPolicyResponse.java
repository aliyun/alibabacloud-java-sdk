// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UpdateDrGatewayFlowControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDrGatewayFlowControlPolicyResponseBody body;

    public static UpdateDrGatewayFlowControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDrGatewayFlowControlPolicyResponse self = new UpdateDrGatewayFlowControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDrGatewayFlowControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDrGatewayFlowControlPolicyResponse setBody(UpdateDrGatewayFlowControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDrGatewayFlowControlPolicyResponseBody getBody() {
        return this.body;
    }

}
