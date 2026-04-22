// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateAgentSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAgentSessionResponseBody body;

    public static CreateAgentSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentSessionResponse self = new CreateAgentSessionResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgentSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgentSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgentSessionResponse setBody(CreateAgentSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgentSessionResponseBody getBody() {
        return this.body;
    }

}
