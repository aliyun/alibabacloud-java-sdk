// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class RestartGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartGatewayResponseBody body;

    public static RestartGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartGatewayResponse self = new RestartGatewayResponse();
        return TeaModel.build(map, self);
    }

    public RestartGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartGatewayResponse setBody(RestartGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartGatewayResponseBody getBody() {
        return this.body;
    }

}
