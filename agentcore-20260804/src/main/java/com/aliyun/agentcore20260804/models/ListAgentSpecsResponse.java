// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListAgentSpecsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentSpecsResponseBody body;

    public static ListAgentSpecsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSpecsResponse self = new ListAgentSpecsResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentSpecsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentSpecsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentSpecsResponse setBody(ListAgentSpecsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentSpecsResponseBody getBody() {
        return this.body;
    }

}
