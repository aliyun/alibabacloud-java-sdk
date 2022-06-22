// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySentinelRuleInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySentinelRuleInfoResponseBody body;

    public static QuerySentinelRuleInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySentinelRuleInfoResponse self = new QuerySentinelRuleInfoResponse();
        return TeaModel.build(map, self);
    }

    public QuerySentinelRuleInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySentinelRuleInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySentinelRuleInfoResponse setBody(QuerySentinelRuleInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySentinelRuleInfoResponseBody getBody() {
        return this.body;
    }

}
