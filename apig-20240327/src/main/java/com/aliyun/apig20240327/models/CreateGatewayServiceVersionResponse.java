// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateGatewayServiceVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGatewayServiceVersionResponseBody body;

    public static CreateGatewayServiceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayServiceVersionResponse self = new CreateGatewayServiceVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateGatewayServiceVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGatewayServiceVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGatewayServiceVersionResponse setBody(CreateGatewayServiceVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGatewayServiceVersionResponseBody getBody() {
        return this.body;
    }

}
