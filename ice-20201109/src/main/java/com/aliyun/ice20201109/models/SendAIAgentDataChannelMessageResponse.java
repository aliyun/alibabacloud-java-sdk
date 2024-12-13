// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SendAIAgentDataChannelMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendAIAgentDataChannelMessageResponseBody body;

    public static SendAIAgentDataChannelMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        SendAIAgentDataChannelMessageResponse self = new SendAIAgentDataChannelMessageResponse();
        return TeaModel.build(map, self);
    }

    public SendAIAgentDataChannelMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendAIAgentDataChannelMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendAIAgentDataChannelMessageResponse setBody(SendAIAgentDataChannelMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public SendAIAgentDataChannelMessageResponseBody getBody() {
        return this.body;
    }

}
