// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAgentResponseBody body;

    public static CreateAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentResponse self = new CreateAgentResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgentResponse setBody(CreateAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgentResponseBody getBody() {
        return this.body;
    }

}
