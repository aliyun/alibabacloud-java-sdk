// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteInterveneRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteInterveneRuleResponseBody body;

    public static DeleteInterveneRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInterveneRuleResponse self = new DeleteInterveneRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInterveneRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInterveneRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInterveneRuleResponse setBody(DeleteInterveneRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInterveneRuleResponseBody getBody() {
        return this.body;
    }

}
