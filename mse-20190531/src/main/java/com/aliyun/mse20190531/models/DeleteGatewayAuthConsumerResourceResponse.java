// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewayAuthConsumerResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGatewayAuthConsumerResourceResponseBody body;

    public static DeleteGatewayAuthConsumerResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayAuthConsumerResourceResponse self = new DeleteGatewayAuthConsumerResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayAuthConsumerResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewayAuthConsumerResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGatewayAuthConsumerResourceResponse setBody(DeleteGatewayAuthConsumerResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewayAuthConsumerResourceResponseBody getBody() {
        return this.body;
    }

}
