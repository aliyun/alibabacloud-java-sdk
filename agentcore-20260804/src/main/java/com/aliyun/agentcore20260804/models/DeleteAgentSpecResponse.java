// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteAgentSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAgentSpecResponseBody body;

    public static DeleteAgentSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentSpecResponse self = new DeleteAgentSpecResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgentSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgentSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgentSpecResponse setBody(DeleteAgentSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAgentSpecResponseBody getBody() {
        return this.body;
    }

}
