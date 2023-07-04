// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AgentCancelCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AgentCancelCallResponseBody body;

    public static AgentCancelCallResponse build(java.util.Map<String, ?> map) throws Exception {
        AgentCancelCallResponse self = new AgentCancelCallResponse();
        return TeaModel.build(map, self);
    }

    public AgentCancelCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AgentCancelCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AgentCancelCallResponse setBody(AgentCancelCallResponseBody body) {
        this.body = body;
        return this;
    }
    public AgentCancelCallResponseBody getBody() {
        return this.body;
    }

}
