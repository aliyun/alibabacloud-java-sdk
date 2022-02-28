// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class RenewDrGatewayTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RenewDrGatewayTokenResponseBody body;

    public static RenewDrGatewayTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewDrGatewayTokenResponse self = new RenewDrGatewayTokenResponse();
        return TeaModel.build(map, self);
    }

    public RenewDrGatewayTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewDrGatewayTokenResponse setBody(RenewDrGatewayTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewDrGatewayTokenResponseBody getBody() {
        return this.body;
    }

}
