// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRewriteUrlRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRewriteUrlRulesResponseBody body;

    public static ListRewriteUrlRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRewriteUrlRulesResponse self = new ListRewriteUrlRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListRewriteUrlRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRewriteUrlRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRewriteUrlRulesResponse setBody(ListRewriteUrlRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRewriteUrlRulesResponseBody getBody() {
        return this.body;
    }

}
