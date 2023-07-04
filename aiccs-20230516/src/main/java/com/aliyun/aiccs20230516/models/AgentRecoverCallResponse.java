// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AgentRecoverCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AgentRecoverCallResponseBody body;

    public static AgentRecoverCallResponse build(java.util.Map<String, ?> map) throws Exception {
        AgentRecoverCallResponse self = new AgentRecoverCallResponse();
        return TeaModel.build(map, self);
    }

    public AgentRecoverCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AgentRecoverCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AgentRecoverCallResponse setBody(AgentRecoverCallResponseBody body) {
        this.body = body;
        return this;
    }
    public AgentRecoverCallResponseBody getBody() {
        return this.body;
    }

}
