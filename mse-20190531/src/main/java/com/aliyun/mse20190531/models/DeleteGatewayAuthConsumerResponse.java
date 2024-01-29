// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewayAuthConsumerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGatewayAuthConsumerResponseBody body;

    public static DeleteGatewayAuthConsumerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayAuthConsumerResponse self = new DeleteGatewayAuthConsumerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayAuthConsumerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewayAuthConsumerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGatewayAuthConsumerResponse setBody(DeleteGatewayAuthConsumerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewayAuthConsumerResponseBody getBody() {
        return this.body;
    }

}
