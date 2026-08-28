// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListAgentTeamsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentTeamsResponseBody body;

    public static ListAgentTeamsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentTeamsResponse self = new ListAgentTeamsResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentTeamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentTeamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentTeamsResponse setBody(ListAgentTeamsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentTeamsResponseBody getBody() {
        return this.body;
    }

}
