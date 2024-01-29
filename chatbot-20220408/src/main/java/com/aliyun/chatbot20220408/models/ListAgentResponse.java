// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentResponseBody body;

    public static ListAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentResponse self = new ListAgentResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentResponse setBody(ListAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentResponseBody getBody() {
        return this.body;
    }

}
