// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class RebootGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RebootGatewayResponseBody body;

    public static RebootGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootGatewayResponse self = new RebootGatewayResponse();
        return TeaModel.build(map, self);
    }

    public RebootGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebootGatewayResponse setBody(RebootGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public RebootGatewayResponseBody getBody() {
        return this.body;
    }

}
