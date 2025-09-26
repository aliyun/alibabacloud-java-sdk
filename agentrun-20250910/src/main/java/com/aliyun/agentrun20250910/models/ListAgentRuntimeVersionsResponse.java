// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListAgentRuntimeVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentRuntimeVersionsResult body;

    public static ListAgentRuntimeVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentRuntimeVersionsResponse self = new ListAgentRuntimeVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentRuntimeVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentRuntimeVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentRuntimeVersionsResponse setBody(ListAgentRuntimeVersionsResult body) {
        this.body = body;
        return this;
    }
    public ListAgentRuntimeVersionsResult getBody() {
        return this.body;
    }

}
