// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteAgentVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAgentVersionResponseBody body;

    public static DeleteAgentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentVersionResponse self = new DeleteAgentVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgentVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgentVersionResponse setBody(DeleteAgentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAgentVersionResponseBody getBody() {
        return this.body;
    }

}
