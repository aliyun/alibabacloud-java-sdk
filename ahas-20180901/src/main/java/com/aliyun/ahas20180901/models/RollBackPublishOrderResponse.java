// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class RollBackPublishOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RollBackPublishOrderResponseBody body;

    public static RollBackPublishOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        RollBackPublishOrderResponse self = new RollBackPublishOrderResponse();
        return TeaModel.build(map, self);
    }

    public RollBackPublishOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollBackPublishOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollBackPublishOrderResponse setBody(RollBackPublishOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public RollBackPublishOrderResponseBody getBody() {
        return this.body;
    }

}
