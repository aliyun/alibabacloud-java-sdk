// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAuthorizationRuleResponseBody body;

    public static UpdateAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationRuleResponse self = new UpdateAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAuthorizationRuleResponse setBody(UpdateAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
