// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartAIAgentOutboundCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartAIAgentOutboundCallResponseBody body;

    public static StartAIAgentOutboundCallResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAIAgentOutboundCallResponse self = new StartAIAgentOutboundCallResponse();
        return TeaModel.build(map, self);
    }

    public StartAIAgentOutboundCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartAIAgentOutboundCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartAIAgentOutboundCallResponse setBody(StartAIAgentOutboundCallResponseBody body) {
        this.body = body;
        return this;
    }
    public StartAIAgentOutboundCallResponseBody getBody() {
        return this.body;
    }

}
