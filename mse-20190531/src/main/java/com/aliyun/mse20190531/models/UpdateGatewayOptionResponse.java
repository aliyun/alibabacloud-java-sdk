// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayOptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGatewayOptionResponseBody body;

    public static UpdateGatewayOptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayOptionResponse self = new UpdateGatewayOptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayOptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayOptionResponse setBody(UpdateGatewayOptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayOptionResponseBody getBody() {
        return this.body;
    }

}
