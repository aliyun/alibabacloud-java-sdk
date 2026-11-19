// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateMemoryRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMemoryRuleResponseBody body;

    public static UpdateMemoryRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryRuleResponse self = new UpdateMemoryRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMemoryRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMemoryRuleResponse setBody(UpdateMemoryRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMemoryRuleResponseBody getBody() {
        return this.body;
    }

}
