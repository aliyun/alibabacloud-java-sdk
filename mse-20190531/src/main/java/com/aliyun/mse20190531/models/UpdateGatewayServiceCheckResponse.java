// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayServiceCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayServiceCheckResponseBody body;

    public static UpdateGatewayServiceCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayServiceCheckResponse self = new UpdateGatewayServiceCheckResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayServiceCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayServiceCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayServiceCheckResponse setBody(UpdateGatewayServiceCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayServiceCheckResponseBody getBody() {
        return this.body;
    }

}
