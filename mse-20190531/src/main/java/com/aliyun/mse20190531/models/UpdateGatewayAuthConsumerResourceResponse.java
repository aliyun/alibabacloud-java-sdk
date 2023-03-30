// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayAuthConsumerResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGatewayAuthConsumerResourceResponseBody body;

    public static UpdateGatewayAuthConsumerResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayAuthConsumerResourceResponse self = new UpdateGatewayAuthConsumerResourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayAuthConsumerResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayAuthConsumerResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayAuthConsumerResourceResponse setBody(UpdateGatewayAuthConsumerResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayAuthConsumerResourceResponseBody getBody() {
        return this.body;
    }

}
