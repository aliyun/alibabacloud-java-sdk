// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateAgentSpaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAgentSpaceResponseBody body;

    public static UpdateAgentSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentSpaceResponse self = new UpdateAgentSpaceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAgentSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAgentSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAgentSpaceResponse setBody(UpdateAgentSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAgentSpaceResponseBody getBody() {
        return this.body;
    }

}
