// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteManagedAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteManagedAgentResponseBody body;

    public static DeleteManagedAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteManagedAgentResponse self = new DeleteManagedAgentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteManagedAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteManagedAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteManagedAgentResponse setBody(DeleteManagedAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteManagedAgentResponseBody getBody() {
        return this.body;
    }

}
