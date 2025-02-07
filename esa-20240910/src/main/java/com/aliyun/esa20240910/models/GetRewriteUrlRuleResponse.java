// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRewriteUrlRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRewriteUrlRuleResponseBody body;

    public static GetRewriteUrlRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRewriteUrlRuleResponse self = new GetRewriteUrlRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetRewriteUrlRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRewriteUrlRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRewriteUrlRuleResponse setBody(GetRewriteUrlRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRewriteUrlRuleResponseBody getBody() {
        return this.body;
    }

}
