// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateAgentSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAgentSpecResponseBody body;

    public static UpdateAgentSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentSpecResponse self = new UpdateAgentSpecResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAgentSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAgentSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAgentSpecResponse setBody(UpdateAgentSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAgentSpecResponseBody getBody() {
        return this.body;
    }

}
