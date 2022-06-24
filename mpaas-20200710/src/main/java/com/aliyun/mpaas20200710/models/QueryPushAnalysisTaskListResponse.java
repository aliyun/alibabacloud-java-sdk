// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class QueryPushAnalysisTaskListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPushAnalysisTaskListResponseBody body;

    public static QueryPushAnalysisTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPushAnalysisTaskListResponse self = new QueryPushAnalysisTaskListResponse();
        return TeaModel.build(map, self);
    }

    public QueryPushAnalysisTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPushAnalysisTaskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPushAnalysisTaskListResponse setBody(QueryPushAnalysisTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPushAnalysisTaskListResponseBody getBody() {
        return this.body;
    }

}
