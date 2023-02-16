// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class EnableRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableRuleResponseBody body;

    public static EnableRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableRuleResponse self = new EnableRuleResponse();
        return TeaModel.build(map, self);
    }

    public EnableRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableRuleResponse setBody(EnableRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableRuleResponseBody getBody() {
        return this.body;
    }

}
