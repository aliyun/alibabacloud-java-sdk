// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateAgentRuntimeEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AgentRuntimeEndpointResult body;

    public static CreateAgentRuntimeEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentRuntimeEndpointResponse self = new CreateAgentRuntimeEndpointResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgentRuntimeEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgentRuntimeEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgentRuntimeEndpointResponse setBody(AgentRuntimeEndpointResult body) {
        this.body = body;
        return this;
    }
    public AgentRuntimeEndpointResult getBody() {
        return this.body;
    }

}
