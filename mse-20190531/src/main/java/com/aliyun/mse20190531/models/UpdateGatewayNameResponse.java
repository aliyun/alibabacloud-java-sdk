// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGatewayNameResponseBody body;

    public static UpdateGatewayNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayNameResponse self = new UpdateGatewayNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayNameResponse setBody(UpdateGatewayNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayNameResponseBody getBody() {
        return this.body;
    }

}
