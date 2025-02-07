// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteRewriteUrlRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRewriteUrlRuleResponseBody body;

    public static DeleteRewriteUrlRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRewriteUrlRuleResponse self = new DeleteRewriteUrlRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRewriteUrlRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRewriteUrlRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRewriteUrlRuleResponse setBody(DeleteRewriteUrlRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRewriteUrlRuleResponseBody getBody() {
        return this.body;
    }

}
