// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayAuthConsumerResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListGatewayAuthConsumerResourceResponseBody body;

    public static ListGatewayAuthConsumerResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayAuthConsumerResourceResponse self = new ListGatewayAuthConsumerResourceResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayAuthConsumerResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayAuthConsumerResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayAuthConsumerResourceResponse setBody(ListGatewayAuthConsumerResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayAuthConsumerResourceResponseBody getBody() {
        return this.body;
    }

}
