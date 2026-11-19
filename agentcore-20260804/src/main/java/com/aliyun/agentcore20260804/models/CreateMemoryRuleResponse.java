// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateMemoryRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMemoryRuleResponseBody body;

    public static CreateMemoryRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryRuleResponse self = new CreateMemoryRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateMemoryRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMemoryRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMemoryRuleResponse setBody(CreateMemoryRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMemoryRuleResponseBody getBody() {
        return this.body;
    }

}
