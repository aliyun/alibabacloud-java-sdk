// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetAgentRuntimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AgentRuntimeResult body;

    public static GetAgentRuntimeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentRuntimeResponse self = new GetAgentRuntimeResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentRuntimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentRuntimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentRuntimeResponse setBody(AgentRuntimeResult body) {
        this.body = body;
        return this;
    }
    public AgentRuntimeResult getBody() {
        return this.body;
    }

}
