// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class SendMessageCopyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendMessageCopyResponseBody body;

    public static SendMessageCopyResponse build(java.util.Map<String, ?> map) throws Exception {
        SendMessageCopyResponse self = new SendMessageCopyResponse();
        return TeaModel.build(map, self);
    }

    public SendMessageCopyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendMessageCopyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendMessageCopyResponse setBody(SendMessageCopyResponseBody body) {
        this.body = body;
        return this;
    }
    public SendMessageCopyResponseBody getBody() {
        return this.body;
    }

}
