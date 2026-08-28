// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetAgentIMChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentIMChannelResponseBody body;

    public static GetAgentIMChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentIMChannelResponse self = new GetAgentIMChannelResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentIMChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentIMChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentIMChannelResponse setBody(GetAgentIMChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentIMChannelResponseBody getBody() {
        return this.body;
    }

}
