// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class RemoveMockRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveMockRuleResponseBody body;

    public static RemoveMockRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveMockRuleResponse self = new RemoveMockRuleResponse();
        return TeaModel.build(map, self);
    }

    public RemoveMockRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveMockRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveMockRuleResponse setBody(RemoveMockRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveMockRuleResponseBody getBody() {
        return this.body;
    }

}
