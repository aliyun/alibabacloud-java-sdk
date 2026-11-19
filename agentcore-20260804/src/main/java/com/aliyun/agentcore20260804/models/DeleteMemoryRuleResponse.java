// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteMemoryRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMemoryRuleResponseBody body;

    public static DeleteMemoryRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMemoryRuleResponse self = new DeleteMemoryRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMemoryRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMemoryRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMemoryRuleResponse setBody(DeleteMemoryRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMemoryRuleResponseBody getBody() {
        return this.body;
    }

}
