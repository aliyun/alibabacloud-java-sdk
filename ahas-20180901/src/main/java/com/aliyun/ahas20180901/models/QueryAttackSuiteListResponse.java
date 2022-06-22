// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAttackSuiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAttackSuiteListResponseBody body;

    public static QueryAttackSuiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAttackSuiteListResponse self = new QueryAttackSuiteListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAttackSuiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAttackSuiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAttackSuiteListResponse setBody(QueryAttackSuiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAttackSuiteListResponseBody getBody() {
        return this.body;
    }

}
