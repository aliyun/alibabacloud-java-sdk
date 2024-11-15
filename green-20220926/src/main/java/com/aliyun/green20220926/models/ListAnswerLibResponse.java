// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListAnswerLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAnswerLibResponseBody body;

    public static ListAnswerLibResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAnswerLibResponse self = new ListAnswerLibResponse();
        return TeaModel.build(map, self);
    }

    public ListAnswerLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAnswerLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAnswerLibResponse setBody(ListAnswerLibResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAnswerLibResponseBody getBody() {
        return this.body;
    }

}
