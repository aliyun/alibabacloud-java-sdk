// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateAgentRuntimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AgentRuntimeResult body;

    public static CreateAgentRuntimeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentRuntimeResponse self = new CreateAgentRuntimeResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgentRuntimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgentRuntimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgentRuntimeResponse setBody(AgentRuntimeResult body) {
        this.body = body;
        return this;
    }
    public AgentRuntimeResult getBody() {
        return this.body;
    }

}
