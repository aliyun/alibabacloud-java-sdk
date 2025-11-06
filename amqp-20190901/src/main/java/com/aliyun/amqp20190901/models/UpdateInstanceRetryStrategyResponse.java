// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class UpdateInstanceRetryStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstanceRetryStrategyResponseBody body;

    public static UpdateInstanceRetryStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceRetryStrategyResponse self = new UpdateInstanceRetryStrategyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceRetryStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceRetryStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceRetryStrategyResponse setBody(UpdateInstanceRetryStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceRetryStrategyResponseBody getBody() {
        return this.body;
    }

}
