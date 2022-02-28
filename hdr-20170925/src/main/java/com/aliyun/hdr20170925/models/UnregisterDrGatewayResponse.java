// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UnregisterDrGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnregisterDrGatewayResponseBody body;

    public static UnregisterDrGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        UnregisterDrGatewayResponse self = new UnregisterDrGatewayResponse();
        return TeaModel.build(map, self);
    }

    public UnregisterDrGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnregisterDrGatewayResponse setBody(UnregisterDrGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public UnregisterDrGatewayResponseBody getBody() {
        return this.body;
    }

}
