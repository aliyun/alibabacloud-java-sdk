// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class InsertInterveneRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsertInterveneRuleResponseBody body;

    public static InsertInterveneRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertInterveneRuleResponse self = new InsertInterveneRuleResponse();
        return TeaModel.build(map, self);
    }

    public InsertInterveneRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertInterveneRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertInterveneRuleResponse setBody(InsertInterveneRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertInterveneRuleResponseBody getBody() {
        return this.body;
    }

}
