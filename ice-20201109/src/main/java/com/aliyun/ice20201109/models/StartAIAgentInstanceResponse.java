// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartAIAgentInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartAIAgentInstanceResponseBody body;

    public static StartAIAgentInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAIAgentInstanceResponse self = new StartAIAgentInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StartAIAgentInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartAIAgentInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartAIAgentInstanceResponse setBody(StartAIAgentInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartAIAgentInstanceResponseBody getBody() {
        return this.body;
    }

}
