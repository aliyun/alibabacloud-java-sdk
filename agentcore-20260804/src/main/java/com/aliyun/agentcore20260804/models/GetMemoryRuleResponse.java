// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetMemoryRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMemoryRuleResponseBody body;

    public static GetMemoryRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryRuleResponse self = new GetMemoryRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetMemoryRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMemoryRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMemoryRuleResponse setBody(GetMemoryRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMemoryRuleResponseBody getBody() {
        return this.body;
    }

}
