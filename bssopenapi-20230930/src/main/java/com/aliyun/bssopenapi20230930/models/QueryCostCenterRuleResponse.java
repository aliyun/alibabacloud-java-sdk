// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class QueryCostCenterRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCostCenterRuleResponseBody body;

    public static QueryCostCenterRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCostCenterRuleResponse self = new QueryCostCenterRuleResponse();
        return TeaModel.build(map, self);
    }

    public QueryCostCenterRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCostCenterRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCostCenterRuleResponse setBody(QueryCostCenterRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCostCenterRuleResponseBody getBody() {
        return this.body;
    }

}
