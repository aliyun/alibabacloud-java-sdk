// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateExternalAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateExternalAgentResponseBody body;

    public static UpdateExternalAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExternalAgentResponse self = new UpdateExternalAgentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExternalAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExternalAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExternalAgentResponse setBody(UpdateExternalAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExternalAgentResponseBody getBody() {
        return this.body;
    }

}
