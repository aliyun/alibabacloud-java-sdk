// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetQueueConsumersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQueueConsumersResponseBody body;

    public static GetQueueConsumersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueueConsumersResponse self = new GetQueueConsumersResponse();
        return TeaModel.build(map, self);
    }

    public GetQueueConsumersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQueueConsumersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQueueConsumersResponse setBody(GetQueueConsumersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueueConsumersResponseBody getBody() {
        return this.body;
    }

}
