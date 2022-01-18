// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewaySlbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddGatewaySlbResponseBody body;

    public static AddGatewaySlbResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGatewaySlbResponse self = new AddGatewaySlbResponse();
        return TeaModel.build(map, self);
    }

    public AddGatewaySlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGatewaySlbResponse setBody(AddGatewaySlbResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGatewaySlbResponseBody getBody() {
        return this.body;
    }

}
