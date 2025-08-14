// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class QueryCostCenterShareRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCostCenterShareRuleResponseBody body;

    public static QueryCostCenterShareRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCostCenterShareRuleResponse self = new QueryCostCenterShareRuleResponse();
        return TeaModel.build(map, self);
    }

    public QueryCostCenterShareRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCostCenterShareRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCostCenterShareRuleResponse setBody(QueryCostCenterShareRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCostCenterShareRuleResponseBody getBody() {
        return this.body;
    }

}
