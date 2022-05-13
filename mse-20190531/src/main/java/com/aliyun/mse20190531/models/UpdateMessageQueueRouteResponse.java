// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateMessageQueueRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMessageQueueRouteResponseBody body;

    public static UpdateMessageQueueRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMessageQueueRouteResponse self = new UpdateMessageQueueRouteResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMessageQueueRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMessageQueueRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMessageQueueRouteResponse setBody(UpdateMessageQueueRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMessageQueueRouteResponseBody getBody() {
        return this.body;
    }

}
