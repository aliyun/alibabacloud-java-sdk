// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateManagedAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateManagedAgentResponseBody body;

    public static UpdateManagedAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateManagedAgentResponse self = new UpdateManagedAgentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateManagedAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateManagedAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateManagedAgentResponse setBody(UpdateManagedAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateManagedAgentResponseBody getBody() {
        return this.body;
    }

}
