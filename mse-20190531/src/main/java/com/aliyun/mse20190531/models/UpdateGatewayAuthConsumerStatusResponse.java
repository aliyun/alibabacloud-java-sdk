// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayAuthConsumerStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayAuthConsumerStatusResponseBody body;

    public static UpdateGatewayAuthConsumerStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayAuthConsumerStatusResponse self = new UpdateGatewayAuthConsumerStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayAuthConsumerStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayAuthConsumerStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayAuthConsumerStatusResponse setBody(UpdateGatewayAuthConsumerStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayAuthConsumerStatusResponseBody getBody() {
        return this.body;
    }

}
