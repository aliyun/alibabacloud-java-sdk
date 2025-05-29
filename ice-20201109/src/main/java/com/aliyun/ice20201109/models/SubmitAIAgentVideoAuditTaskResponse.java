// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAIAgentVideoAuditTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAIAgentVideoAuditTaskResponseBody body;

    public static SubmitAIAgentVideoAuditTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIAgentVideoAuditTaskResponse self = new SubmitAIAgentVideoAuditTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAIAgentVideoAuditTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAIAgentVideoAuditTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAIAgentVideoAuditTaskResponse setBody(SubmitAIAgentVideoAuditTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAIAgentVideoAuditTaskResponseBody getBody() {
        return this.body;
    }

}
