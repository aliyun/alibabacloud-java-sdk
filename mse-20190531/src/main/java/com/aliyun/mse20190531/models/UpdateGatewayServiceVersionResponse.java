// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayServiceVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayServiceVersionResponseBody body;

    public static UpdateGatewayServiceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayServiceVersionResponse self = new UpdateGatewayServiceVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayServiceVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayServiceVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayServiceVersionResponse setBody(UpdateGatewayServiceVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayServiceVersionResponseBody getBody() {
        return this.body;
    }

}
