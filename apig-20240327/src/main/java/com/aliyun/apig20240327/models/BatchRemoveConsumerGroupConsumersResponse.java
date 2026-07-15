// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchRemoveConsumerGroupConsumersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchRemoveConsumerGroupConsumersResponseBody body;

    public static BatchRemoveConsumerGroupConsumersResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchRemoveConsumerGroupConsumersResponse self = new BatchRemoveConsumerGroupConsumersResponse();
        return TeaModel.build(map, self);
    }

    public BatchRemoveConsumerGroupConsumersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchRemoveConsumerGroupConsumersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchRemoveConsumerGroupConsumersResponse setBody(BatchRemoveConsumerGroupConsumersResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchRemoveConsumerGroupConsumersResponseBody getBody() {
        return this.body;
    }

}
