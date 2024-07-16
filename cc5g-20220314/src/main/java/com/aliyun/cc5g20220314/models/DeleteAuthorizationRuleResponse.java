// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class DeleteAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAuthorizationRuleResponseBody body;

    public static DeleteAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthorizationRuleResponse self = new DeleteAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAuthorizationRuleResponse setBody(DeleteAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
