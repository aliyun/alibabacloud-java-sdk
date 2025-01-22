// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RunAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunAgentResponseBody body;

    public static RunAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        RunAgentResponse self = new RunAgentResponse();
        return TeaModel.build(map, self);
    }

    public RunAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunAgentResponse setBody(RunAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public RunAgentResponseBody getBody() {
        return this.body;
    }

}
