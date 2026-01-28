// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableAuthorizationRuleResponseBody body;

    public static EnableAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableAuthorizationRuleResponse self = new EnableAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public EnableAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableAuthorizationRuleResponse setBody(EnableAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
