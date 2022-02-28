// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeDrGatewayFlowControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDrGatewayFlowControlPolicyResponseBody body;

    public static DescribeDrGatewayFlowControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrGatewayFlowControlPolicyResponse self = new DescribeDrGatewayFlowControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrGatewayFlowControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrGatewayFlowControlPolicyResponse setBody(DescribeDrGatewayFlowControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrGatewayFlowControlPolicyResponseBody getBody() {
        return this.body;
    }

}
