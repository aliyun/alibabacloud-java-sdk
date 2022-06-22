// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAttackSuiteTaskListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAttackSuiteTaskListResponseBody body;

    public static QueryAttackSuiteTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAttackSuiteTaskListResponse self = new QueryAttackSuiteTaskListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAttackSuiteTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAttackSuiteTaskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAttackSuiteTaskListResponse setBody(QueryAttackSuiteTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAttackSuiteTaskListResponseBody getBody() {
        return this.body;
    }

}
