// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateNatGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateNatGatewayResponseBody body;

    public static CreateNatGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNatGatewayResponse self = new CreateNatGatewayResponse();
        return TeaModel.build(map, self);
    }

    public CreateNatGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNatGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNatGatewayResponse setBody(CreateNatGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNatGatewayResponseBody getBody() {
        return this.body;
    }

}
