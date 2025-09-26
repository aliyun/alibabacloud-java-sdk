// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListAgentRuntimesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentRuntimesResult body;

    public static ListAgentRuntimesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentRuntimesResponse self = new ListAgentRuntimesResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentRuntimesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentRuntimesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentRuntimesResponse setBody(ListAgentRuntimesResult body) {
        this.body = body;
        return this;
    }
    public ListAgentRuntimesResult getBody() {
        return this.body;
    }

}
