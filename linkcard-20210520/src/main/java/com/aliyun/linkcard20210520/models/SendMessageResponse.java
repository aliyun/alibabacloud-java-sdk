// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class SendMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendMessageResponseBody body;

    public static SendMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        SendMessageResponse self = new SendMessageResponse();
        return TeaModel.build(map, self);
    }

    public SendMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendMessageResponse setBody(SendMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public SendMessageResponseBody getBody() {
        return this.body;
    }

}
