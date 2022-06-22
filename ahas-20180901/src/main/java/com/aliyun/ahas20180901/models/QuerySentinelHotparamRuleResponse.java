// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySentinelHotparamRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySentinelHotparamRuleResponseBody body;

    public static QuerySentinelHotparamRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySentinelHotparamRuleResponse self = new QuerySentinelHotparamRuleResponse();
        return TeaModel.build(map, self);
    }

    public QuerySentinelHotparamRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySentinelHotparamRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySentinelHotparamRuleResponse setBody(QuerySentinelHotparamRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySentinelHotparamRuleResponseBody getBody() {
        return this.body;
    }

}
