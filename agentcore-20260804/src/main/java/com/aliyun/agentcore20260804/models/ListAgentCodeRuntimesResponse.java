// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListAgentCodeRuntimesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentCodeRuntimesResponseBody body;

    public static ListAgentCodeRuntimesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentCodeRuntimesResponse self = new ListAgentCodeRuntimesResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentCodeRuntimesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentCodeRuntimesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentCodeRuntimesResponse setBody(ListAgentCodeRuntimesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentCodeRuntimesResponseBody getBody() {
        return this.body;
    }

}
