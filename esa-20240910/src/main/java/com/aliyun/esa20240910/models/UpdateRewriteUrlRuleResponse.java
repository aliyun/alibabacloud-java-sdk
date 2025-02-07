// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRewriteUrlRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRewriteUrlRuleResponseBody body;

    public static UpdateRewriteUrlRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRewriteUrlRuleResponse self = new UpdateRewriteUrlRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRewriteUrlRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRewriteUrlRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRewriteUrlRuleResponse setBody(UpdateRewriteUrlRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRewriteUrlRuleResponseBody getBody() {
        return this.body;
    }

}
