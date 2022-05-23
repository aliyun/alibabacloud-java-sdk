// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class EnableMockRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableMockRuleResponseBody body;

    public static EnableMockRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableMockRuleResponse self = new EnableMockRuleResponse();
        return TeaModel.build(map, self);
    }

    public EnableMockRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableMockRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableMockRuleResponse setBody(EnableMockRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableMockRuleResponseBody getBody() {
        return this.body;
    }

}
