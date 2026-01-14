// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayAuthResponseBody body;

    public static UpdateGatewayAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayAuthResponse self = new UpdateGatewayAuthResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayAuthResponse setBody(UpdateGatewayAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayAuthResponseBody getBody() {
        return this.body;
    }

}
