// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchAddConsumerGroupConsumersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchAddConsumerGroupConsumersResponseBody body;

    public static BatchAddConsumerGroupConsumersResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchAddConsumerGroupConsumersResponse self = new BatchAddConsumerGroupConsumersResponse();
        return TeaModel.build(map, self);
    }

    public BatchAddConsumerGroupConsumersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchAddConsumerGroupConsumersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchAddConsumerGroupConsumersResponse setBody(BatchAddConsumerGroupConsumersResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchAddConsumerGroupConsumersResponseBody getBody() {
        return this.body;
    }

}
