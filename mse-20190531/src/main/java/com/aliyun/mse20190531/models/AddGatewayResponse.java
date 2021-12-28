// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddGatewayResponseBody body;

    public static AddGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGatewayResponse self = new AddGatewayResponse();
        return TeaModel.build(map, self);
    }

    public AddGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGatewayResponse setBody(AddGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGatewayResponseBody getBody() {
        return this.body;
    }

}
