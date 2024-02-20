// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddGatewayAuthResponseBody body;

    public static AddGatewayAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGatewayAuthResponse self = new AddGatewayAuthResponse();
        return TeaModel.build(map, self);
    }

    public AddGatewayAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGatewayAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddGatewayAuthResponse setBody(AddGatewayAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGatewayAuthResponseBody getBody() {
        return this.body;
    }

}
