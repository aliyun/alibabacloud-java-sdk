// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class UpdateGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGatewayResponseBody body;

    public static UpdateGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayResponse self = new UpdateGatewayResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayResponse setBody(UpdateGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayResponseBody getBody() {
        return this.body;
    }

}
