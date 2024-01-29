// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayAuthConsumerResourceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayAuthConsumerResourceStatusResponseBody body;

    public static UpdateGatewayAuthConsumerResourceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayAuthConsumerResourceStatusResponse self = new UpdateGatewayAuthConsumerResourceStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayAuthConsumerResourceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayAuthConsumerResourceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayAuthConsumerResourceStatusResponse setBody(UpdateGatewayAuthConsumerResourceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayAuthConsumerResourceStatusResponseBody getBody() {
        return this.body;
    }

}
