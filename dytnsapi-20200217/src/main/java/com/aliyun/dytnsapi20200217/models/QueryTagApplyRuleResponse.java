// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryTagApplyRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTagApplyRuleResponseBody body;

    public static QueryTagApplyRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTagApplyRuleResponse self = new QueryTagApplyRuleResponse();
        return TeaModel.build(map, self);
    }

    public QueryTagApplyRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTagApplyRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTagApplyRuleResponse setBody(QueryTagApplyRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTagApplyRuleResponseBody getBody() {
        return this.body;
    }

}
