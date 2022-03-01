// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayServiceTrafficPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGatewayServiceTrafficPolicyResponseBody body;

    public static UpdateGatewayServiceTrafficPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayServiceTrafficPolicyResponse self = new UpdateGatewayServiceTrafficPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayServiceTrafficPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayServiceTrafficPolicyResponse setBody(UpdateGatewayServiceTrafficPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayServiceTrafficPolicyResponseBody getBody() {
        return this.body;
    }

}
