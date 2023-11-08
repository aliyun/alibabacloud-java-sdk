// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListQueueConsumersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListQueueConsumersResponseBody body;

    public static ListQueueConsumersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQueueConsumersResponse self = new ListQueueConsumersResponse();
        return TeaModel.build(map, self);
    }

    public ListQueueConsumersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQueueConsumersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQueueConsumersResponse setBody(ListQueueConsumersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQueueConsumersResponseBody getBody() {
        return this.body;
    }

}
