// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class StartChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartChatResponseBody body;

    public static StartChatResponse build(java.util.Map<String, ?> map) throws Exception {
        StartChatResponse self = new StartChatResponse();
        return TeaModel.build(map, self);
    }

    public StartChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartChatResponse setBody(StartChatResponseBody body) {
        this.body = body;
        return this;
    }
    public StartChatResponseBody getBody() {
        return this.body;
    }

}
