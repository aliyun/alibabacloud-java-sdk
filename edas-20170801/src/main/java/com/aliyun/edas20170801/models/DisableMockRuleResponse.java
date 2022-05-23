// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DisableMockRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DisableMockRuleResponseBody body;

    public static DisableMockRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableMockRuleResponse self = new DisableMockRuleResponse();
        return TeaModel.build(map, self);
    }

    public DisableMockRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableMockRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableMockRuleResponse setBody(DisableMockRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableMockRuleResponseBody getBody() {
        return this.body;
    }

}
