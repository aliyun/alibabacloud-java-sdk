// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DeployGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeployGatewayResponseBody body;

    public static DeployGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployGatewayResponse self = new DeployGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DeployGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployGatewayResponse setBody(DeployGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployGatewayResponseBody getBody() {
        return this.body;
    }

}
