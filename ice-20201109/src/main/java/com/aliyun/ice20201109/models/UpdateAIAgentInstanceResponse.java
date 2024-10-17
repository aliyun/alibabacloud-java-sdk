// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateAIAgentInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAIAgentInstanceResponseBody body;

    public static UpdateAIAgentInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAIAgentInstanceResponse self = new UpdateAIAgentInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAIAgentInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAIAgentInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAIAgentInstanceResponse setBody(UpdateAIAgentInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAIAgentInstanceResponseBody getBody() {
        return this.body;
    }

}
