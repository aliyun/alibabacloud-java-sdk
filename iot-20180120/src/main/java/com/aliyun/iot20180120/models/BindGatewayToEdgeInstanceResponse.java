// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BindGatewayToEdgeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindGatewayToEdgeInstanceResponseBody body;

    public static BindGatewayToEdgeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        BindGatewayToEdgeInstanceResponse self = new BindGatewayToEdgeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public BindGatewayToEdgeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindGatewayToEdgeInstanceResponse setBody(BindGatewayToEdgeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public BindGatewayToEdgeInstanceResponseBody getBody() {
        return this.body;
    }

}
