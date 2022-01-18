// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayServiceVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddGatewayServiceVersionResponseBody body;

    public static AddGatewayServiceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGatewayServiceVersionResponse self = new AddGatewayServiceVersionResponse();
        return TeaModel.build(map, self);
    }

    public AddGatewayServiceVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGatewayServiceVersionResponse setBody(AddGatewayServiceVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGatewayServiceVersionResponseBody getBody() {
        return this.body;
    }

}
