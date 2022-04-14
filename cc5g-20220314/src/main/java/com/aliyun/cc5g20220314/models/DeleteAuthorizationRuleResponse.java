// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class DeleteAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteAuthorizationRuleResponse setBody(DeleteAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
