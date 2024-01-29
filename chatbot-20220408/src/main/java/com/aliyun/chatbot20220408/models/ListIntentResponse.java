// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListIntentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIntentResponseBody body;

    public static ListIntentResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIntentResponse self = new ListIntentResponse();
        return TeaModel.build(map, self);
    }

    public ListIntentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIntentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIntentResponse setBody(ListIntentResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIntentResponseBody getBody() {
        return this.body;
    }

}
