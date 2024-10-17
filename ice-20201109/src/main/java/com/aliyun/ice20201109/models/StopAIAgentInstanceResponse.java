// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StopAIAgentInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopAIAgentInstanceResponseBody body;

    public static StopAIAgentInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopAIAgentInstanceResponse self = new StopAIAgentInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopAIAgentInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopAIAgentInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopAIAgentInstanceResponse setBody(StopAIAgentInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopAIAgentInstanceResponseBody getBody() {
        return this.body;
    }

}
