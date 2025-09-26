// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteAgentRuntimeEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AgentRuntimeEndpointResult body;

    public static DeleteAgentRuntimeEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentRuntimeEndpointResponse self = new DeleteAgentRuntimeEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgentRuntimeEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgentRuntimeEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgentRuntimeEndpointResponse setBody(AgentRuntimeEndpointResult body) {
        this.body = body;
        return this;
    }
    public AgentRuntimeEndpointResult getBody() {
        return this.body;
    }

}
