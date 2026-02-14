// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateCustomAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomAgentResponseBody body;

    public static CreateCustomAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomAgentResponse self = new CreateCustomAgentResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomAgentResponse setBody(CreateCustomAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomAgentResponseBody getBody() {
        return this.body;
    }

}
