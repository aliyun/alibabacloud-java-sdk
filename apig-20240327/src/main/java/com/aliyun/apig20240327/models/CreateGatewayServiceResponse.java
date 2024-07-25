// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateGatewayServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGatewayServiceResponseBody body;

    public static CreateGatewayServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayServiceResponse self = new CreateGatewayServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateGatewayServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGatewayServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGatewayServiceResponse setBody(CreateGatewayServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGatewayServiceResponseBody getBody() {
        return this.body;
    }

}
