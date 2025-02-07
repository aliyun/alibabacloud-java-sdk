// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRewriteUrlRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRewriteUrlRuleResponseBody body;

    public static CreateRewriteUrlRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRewriteUrlRuleResponse self = new CreateRewriteUrlRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateRewriteUrlRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRewriteUrlRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRewriteUrlRuleResponse setBody(CreateRewriteUrlRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRewriteUrlRuleResponseBody getBody() {
        return this.body;
    }

}
