// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ReplaceEdgeInstanceGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ReplaceEdgeInstanceGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReplaceEdgeInstanceGatewayResponse setBody(ReplaceEdgeInstanceGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceEdgeInstanceGatewayResponseBody getBody() {
        return this.body;
    }

}
