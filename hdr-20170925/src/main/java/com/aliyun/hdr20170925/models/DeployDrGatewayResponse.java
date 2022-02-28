// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DeployDrGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeployDrGatewayResponseBody body;

    public static DeployDrGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployDrGatewayResponse self = new DeployDrGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DeployDrGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployDrGatewayResponse setBody(DeployDrGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployDrGatewayResponseBody getBody() {
        return this.body;
    }

}
