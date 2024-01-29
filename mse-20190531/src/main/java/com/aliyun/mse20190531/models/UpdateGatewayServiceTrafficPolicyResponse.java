// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayServiceTrafficPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateGatewayServiceTrafficPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayServiceTrafficPolicyResponse setBody(UpdateGatewayServiceTrafficPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayServiceTrafficPolicyResponseBody getBody() {
        return this.body;
    }

}
