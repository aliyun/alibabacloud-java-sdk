// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewaySpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewaySpecResponseBody body;

    public static UpdateGatewaySpecResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewaySpecResponse self = new UpdateGatewaySpecResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewaySpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewaySpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewaySpecResponse setBody(UpdateGatewaySpecResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewaySpecResponseBody getBody() {
        return this.body;
    }

}
