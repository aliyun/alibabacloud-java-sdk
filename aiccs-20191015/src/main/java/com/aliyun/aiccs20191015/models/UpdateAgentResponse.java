// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAgentResponseBody body;

    public static UpdateAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentResponse self = new UpdateAgentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAgentResponse setBody(UpdateAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAgentResponseBody getBody() {
        return this.body;
    }

}
