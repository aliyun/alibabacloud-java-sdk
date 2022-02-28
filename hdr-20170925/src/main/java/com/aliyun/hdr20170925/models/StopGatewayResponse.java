// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class StopGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopGatewayResponseBody body;

    public static StopGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        StopGatewayResponse self = new StopGatewayResponse();
        return TeaModel.build(map, self);
    }

    public StopGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopGatewayResponse setBody(StopGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public StopGatewayResponseBody getBody() {
        return this.body;
    }

}
