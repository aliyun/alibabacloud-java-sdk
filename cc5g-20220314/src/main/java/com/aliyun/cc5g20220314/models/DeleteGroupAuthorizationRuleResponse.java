// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class DeleteGroupAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGroupAuthorizationRuleResponseBody body;

    public static DeleteGroupAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupAuthorizationRuleResponse self = new DeleteGroupAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGroupAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGroupAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGroupAuthorizationRuleResponse setBody(DeleteGroupAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGroupAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
