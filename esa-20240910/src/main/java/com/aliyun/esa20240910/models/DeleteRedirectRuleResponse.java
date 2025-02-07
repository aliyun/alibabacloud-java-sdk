// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteRedirectRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRedirectRuleResponseBody body;

    public static DeleteRedirectRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRedirectRuleResponse self = new DeleteRedirectRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRedirectRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRedirectRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRedirectRuleResponse setBody(DeleteRedirectRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRedirectRuleResponseBody getBody() {
        return this.body;
    }

}
