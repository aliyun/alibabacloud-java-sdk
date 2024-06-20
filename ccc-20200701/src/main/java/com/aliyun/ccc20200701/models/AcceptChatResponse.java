// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AcceptChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AcceptChatResponseBody body;

    public static AcceptChatResponse build(java.util.Map<String, ?> map) throws Exception {
        AcceptChatResponse self = new AcceptChatResponse();
        return TeaModel.build(map, self);
    }

    public AcceptChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AcceptChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AcceptChatResponse setBody(AcceptChatResponseBody body) {
        this.body = body;
        return this;
    }
    public AcceptChatResponseBody getBody() {
        return this.body;
    }

}
