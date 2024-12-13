// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class TakeoverAIAgentCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TakeoverAIAgentCallResponseBody body;

    public static TakeoverAIAgentCallResponse build(java.util.Map<String, ?> map) throws Exception {
        TakeoverAIAgentCallResponse self = new TakeoverAIAgentCallResponse();
        return TeaModel.build(map, self);
    }

    public TakeoverAIAgentCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TakeoverAIAgentCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TakeoverAIAgentCallResponse setBody(TakeoverAIAgentCallResponseBody body) {
        this.body = body;
        return this;
    }
    public TakeoverAIAgentCallResponseBody getBody() {
        return this.body;
    }

}
