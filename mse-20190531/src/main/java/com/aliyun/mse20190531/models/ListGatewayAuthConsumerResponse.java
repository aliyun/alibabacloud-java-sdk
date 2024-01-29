// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayAuthConsumerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayAuthConsumerResponseBody body;

    public static ListGatewayAuthConsumerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayAuthConsumerResponse self = new ListGatewayAuthConsumerResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayAuthConsumerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayAuthConsumerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayAuthConsumerResponse setBody(ListGatewayAuthConsumerResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayAuthConsumerResponseBody getBody() {
        return this.body;
    }

}
