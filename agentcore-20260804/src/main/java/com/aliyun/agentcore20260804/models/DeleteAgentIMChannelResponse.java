// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteAgentIMChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAgentIMChannelResponseBody body;

    public static DeleteAgentIMChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentIMChannelResponse self = new DeleteAgentIMChannelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgentIMChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgentIMChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgentIMChannelResponse setBody(DeleteAgentIMChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAgentIMChannelResponseBody getBody() {
        return this.body;
    }

}
