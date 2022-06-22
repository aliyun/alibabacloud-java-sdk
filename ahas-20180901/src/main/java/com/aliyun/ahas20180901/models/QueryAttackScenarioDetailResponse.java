// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAttackScenarioDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAttackScenarioDetailResponseBody body;

    public static QueryAttackScenarioDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAttackScenarioDetailResponse self = new QueryAttackScenarioDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryAttackScenarioDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAttackScenarioDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAttackScenarioDetailResponse setBody(QueryAttackScenarioDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAttackScenarioDetailResponseBody getBody() {
        return this.body;
    }

}
