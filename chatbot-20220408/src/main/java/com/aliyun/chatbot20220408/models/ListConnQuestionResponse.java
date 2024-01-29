// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListConnQuestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConnQuestionResponseBody body;

    public static ListConnQuestionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConnQuestionResponse self = new ListConnQuestionResponse();
        return TeaModel.build(map, self);
    }

    public ListConnQuestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConnQuestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConnQuestionResponse setBody(ListConnQuestionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConnQuestionResponseBody getBody() {
        return this.body;
    }

}
