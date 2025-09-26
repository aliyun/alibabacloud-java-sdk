// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListAgentRuntimeEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentRuntimeEndpointsResult body;

    public static ListAgentRuntimeEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentRuntimeEndpointsResponse self = new ListAgentRuntimeEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentRuntimeEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentRuntimeEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentRuntimeEndpointsResponse setBody(ListAgentRuntimeEndpointsResult body) {
        this.body = body;
        return this;
    }
    public ListAgentRuntimeEndpointsResult getBody() {
        return this.body;
    }

}
