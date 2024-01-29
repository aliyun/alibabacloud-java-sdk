// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateGatewayNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayNameResponse setBody(UpdateGatewayNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayNameResponseBody getBody() {
        return this.body;
    }

}
