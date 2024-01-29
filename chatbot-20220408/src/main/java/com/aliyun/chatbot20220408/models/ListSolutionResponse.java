// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListSolutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSolutionResponseBody body;

    public static ListSolutionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSolutionResponse self = new ListSolutionResponse();
        return TeaModel.build(map, self);
    }

    public ListSolutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSolutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSolutionResponse setBody(ListSolutionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSolutionResponseBody getBody() {
        return this.body;
    }

}
