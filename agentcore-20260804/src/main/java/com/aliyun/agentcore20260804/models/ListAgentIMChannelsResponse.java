// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListAgentIMChannelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentIMChannelsResponseBody body;

    public static ListAgentIMChannelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentIMChannelsResponse self = new ListAgentIMChannelsResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentIMChannelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentIMChannelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentIMChannelsResponse setBody(ListAgentIMChannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentIMChannelsResponseBody getBody() {
        return this.body;
    }

}
