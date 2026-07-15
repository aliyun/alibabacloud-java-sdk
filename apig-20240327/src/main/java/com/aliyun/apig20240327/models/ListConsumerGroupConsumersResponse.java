// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListConsumerGroupConsumersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConsumerGroupConsumersResponseBody body;

    public static ListConsumerGroupConsumersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerGroupConsumersResponse self = new ListConsumerGroupConsumersResponse();
        return TeaModel.build(map, self);
    }

    public ListConsumerGroupConsumersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConsumerGroupConsumersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConsumerGroupConsumersResponse setBody(ListConsumerGroupConsumersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConsumerGroupConsumersResponseBody getBody() {
        return this.body;
    }

}
