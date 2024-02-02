// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UnsubscribeTopicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnsubscribeTopicResponseBody body;

    public static UnsubscribeTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        UnsubscribeTopicResponse self = new UnsubscribeTopicResponse();
        return TeaModel.build(map, self);
    }

    public UnsubscribeTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnsubscribeTopicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnsubscribeTopicResponse setBody(UnsubscribeTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public UnsubscribeTopicResponseBody getBody() {
        return this.body;
    }

}
