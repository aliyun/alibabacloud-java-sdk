// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayConfigResponseBody body;

    public static UpdateGatewayConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayConfigResponse self = new UpdateGatewayConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayConfigResponse setBody(UpdateGatewayConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayConfigResponseBody getBody() {
        return this.body;
    }

}
