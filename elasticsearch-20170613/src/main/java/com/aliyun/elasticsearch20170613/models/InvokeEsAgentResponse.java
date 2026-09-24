// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InvokeEsAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvokeEsAgentResponseBody body;

    public static InvokeEsAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeEsAgentResponse self = new InvokeEsAgentResponse();
        return TeaModel.build(map, self);
    }

    public InvokeEsAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeEsAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvokeEsAgentResponse setBody(InvokeEsAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeEsAgentResponseBody getBody() {
        return this.body;
    }

}
