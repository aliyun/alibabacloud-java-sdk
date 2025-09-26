// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetAgentRuntimeEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AgentRuntimeEndpointResult body;

    public static GetAgentRuntimeEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentRuntimeEndpointResponse self = new GetAgentRuntimeEndpointResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentRuntimeEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentRuntimeEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentRuntimeEndpointResponse setBody(AgentRuntimeEndpointResult body) {
        this.body = body;
        return this;
    }
    public AgentRuntimeEndpointResult getBody() {
        return this.body;
    }

}
