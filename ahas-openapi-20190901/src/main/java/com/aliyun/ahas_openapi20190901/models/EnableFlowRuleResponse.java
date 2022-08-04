// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class EnableFlowRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableFlowRuleResponseBody body;

    public static EnableFlowRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableFlowRuleResponse self = new EnableFlowRuleResponse();
        return TeaModel.build(map, self);
    }

    public EnableFlowRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableFlowRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableFlowRuleResponse setBody(EnableFlowRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableFlowRuleResponseBody getBody() {
        return this.body;
    }

}
