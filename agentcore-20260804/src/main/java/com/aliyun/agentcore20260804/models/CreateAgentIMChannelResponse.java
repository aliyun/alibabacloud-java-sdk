// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateAgentIMChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAgentIMChannelResponseBody body;

    public static CreateAgentIMChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentIMChannelResponse self = new CreateAgentIMChannelResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgentIMChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgentIMChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgentIMChannelResponse setBody(CreateAgentIMChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgentIMChannelResponseBody getBody() {
        return this.body;
    }

}
