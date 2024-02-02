// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BindGatewayToEdgeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public BindGatewayToEdgeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindGatewayToEdgeInstanceResponse setBody(BindGatewayToEdgeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public BindGatewayToEdgeInstanceResponseBody getBody() {
        return this.body;
    }

}
