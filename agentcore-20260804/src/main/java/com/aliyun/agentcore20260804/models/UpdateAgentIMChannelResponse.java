// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateAgentIMChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAgentIMChannelResponseBody body;

    public static UpdateAgentIMChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentIMChannelResponse self = new UpdateAgentIMChannelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAgentIMChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAgentIMChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAgentIMChannelResponse setBody(UpdateAgentIMChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAgentIMChannelResponseBody getBody() {
        return this.body;
    }

}
