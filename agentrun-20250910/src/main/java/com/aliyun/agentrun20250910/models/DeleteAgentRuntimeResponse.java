// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteAgentRuntimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AgentRuntimeResult body;

    public static DeleteAgentRuntimeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentRuntimeResponse self = new DeleteAgentRuntimeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgentRuntimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgentRuntimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgentRuntimeResponse setBody(AgentRuntimeResult body) {
        this.body = body;
        return this;
    }
    public AgentRuntimeResult getBody() {
        return this.body;
    }

}
