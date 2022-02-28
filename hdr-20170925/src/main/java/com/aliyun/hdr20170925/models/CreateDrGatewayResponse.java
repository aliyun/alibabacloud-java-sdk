// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class CreateDrGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDrGatewayResponseBody body;

    public static CreateDrGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDrGatewayResponse self = new CreateDrGatewayResponse();
        return TeaModel.build(map, self);
    }

    public CreateDrGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDrGatewayResponse setBody(CreateDrGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDrGatewayResponseBody getBody() {
        return this.body;
    }

}
