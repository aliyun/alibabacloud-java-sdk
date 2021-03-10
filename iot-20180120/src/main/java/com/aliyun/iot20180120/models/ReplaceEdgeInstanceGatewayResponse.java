// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ReplaceEdgeInstanceGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReplaceEdgeInstanceGatewayResponseBody body;

    public static ReplaceEdgeInstanceGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceEdgeInstanceGatewayResponse self = new ReplaceEdgeInstanceGatewayResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceEdgeInstanceGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceEdgeInstanceGatewayResponse setBody(ReplaceEdgeInstanceGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceEdgeInstanceGatewayResponseBody getBody() {
        return this.body;
    }

}
