// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewayAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGatewayAuthResponseBody body;

    public static DeleteGatewayAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayAuthResponse self = new DeleteGatewayAuthResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewayAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGatewayAuthResponse setBody(DeleteGatewayAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewayAuthResponseBody getBody() {
        return this.body;
    }

}
