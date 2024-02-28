// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DisableRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableRuleResponseBody body;

    public static DisableRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableRuleResponse self = new DisableRuleResponse();
        return TeaModel.build(map, self);
    }

    public DisableRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableRuleResponse setBody(DisableRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableRuleResponseBody getBody() {
        return this.body;
    }

}
