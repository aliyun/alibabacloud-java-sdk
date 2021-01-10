// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateApiGatewayAppStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateApiGatewayAppStatusResponseBody body;

    public static UpdateApiGatewayAppStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiGatewayAppStatusResponse self = new UpdateApiGatewayAppStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApiGatewayAppStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApiGatewayAppStatusResponse setBody(UpdateApiGatewayAppStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApiGatewayAppStatusResponseBody getBody() {
        return this.body;
    }

}
