// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListAgentVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentVersionsResponseBody body;

    public static ListAgentVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentVersionsResponse self = new ListAgentVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentVersionsResponse setBody(ListAgentVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentVersionsResponseBody getBody() {
        return this.body;
    }

}
