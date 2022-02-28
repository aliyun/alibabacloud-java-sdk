// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UnregisterGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnregisterGatewayResponseBody body;

    public static UnregisterGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        UnregisterGatewayResponse self = new UnregisterGatewayResponse();
        return TeaModel.build(map, self);
    }

    public UnregisterGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnregisterGatewayResponse setBody(UnregisterGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public UnregisterGatewayResponseBody getBody() {
        return this.body;
    }

}
