// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGatewayResponseBody body;

    public static CreateGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayResponse self = new CreateGatewayResponse();
        return TeaModel.build(map, self);
    }

    public CreateGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGatewayResponse setBody(CreateGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGatewayResponseBody getBody() {
        return this.body;
    }

}
