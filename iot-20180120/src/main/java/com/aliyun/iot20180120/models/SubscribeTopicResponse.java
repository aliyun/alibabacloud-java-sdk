// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SubscribeTopicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubscribeTopicResponseBody body;

    public static SubscribeTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        SubscribeTopicResponse self = new SubscribeTopicResponse();
        return TeaModel.build(map, self);
    }

    public SubscribeTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubscribeTopicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubscribeTopicResponse setBody(SubscribeTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public SubscribeTopicResponseBody getBody() {
        return this.body;
    }

}
