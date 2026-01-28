// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableAuthorizationRuleResponseBody body;

    public static DisableAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableAuthorizationRuleResponse self = new DisableAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public DisableAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableAuthorizationRuleResponse setBody(DisableAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
