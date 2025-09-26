// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateAgentRuntimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AgentRuntimeResult body;

    public static UpdateAgentRuntimeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentRuntimeResponse self = new UpdateAgentRuntimeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAgentRuntimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAgentRuntimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAgentRuntimeResponse setBody(AgentRuntimeResult body) {
        this.body = body;
        return this;
    }
    public AgentRuntimeResult getBody() {
        return this.body;
    }

}
