// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayAuthConsumerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddGatewayAuthConsumerResponseBody body;

    public static AddGatewayAuthConsumerResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGatewayAuthConsumerResponse self = new AddGatewayAuthConsumerResponse();
        return TeaModel.build(map, self);
    }

    public AddGatewayAuthConsumerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGatewayAuthConsumerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddGatewayAuthConsumerResponse setBody(AddGatewayAuthConsumerResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGatewayAuthConsumerResponseBody getBody() {
        return this.body;
    }

}
