// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class StartGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartGatewayResponseBody body;

    public static StartGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        StartGatewayResponse self = new StartGatewayResponse();
        return TeaModel.build(map, self);
    }

    public StartGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartGatewayResponse setBody(StartGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public StartGatewayResponseBody getBody() {
        return this.body;
    }

}
