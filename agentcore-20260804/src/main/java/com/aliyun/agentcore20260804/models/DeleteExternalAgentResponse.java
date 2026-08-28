// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteExternalAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteExternalAgentResponseBody body;

    public static DeleteExternalAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExternalAgentResponse self = new DeleteExternalAgentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExternalAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExternalAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExternalAgentResponse setBody(DeleteExternalAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExternalAgentResponseBody getBody() {
        return this.body;
    }

}
