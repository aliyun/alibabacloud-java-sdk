// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListSimQuestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSimQuestionResponseBody body;

    public static ListSimQuestionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSimQuestionResponse self = new ListSimQuestionResponse();
        return TeaModel.build(map, self);
    }

    public ListSimQuestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSimQuestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSimQuestionResponse setBody(ListSimQuestionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSimQuestionResponseBody getBody() {
        return this.body;
    }

}
