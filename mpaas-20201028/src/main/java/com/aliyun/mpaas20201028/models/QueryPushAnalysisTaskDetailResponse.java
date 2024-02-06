// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryPushAnalysisTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPushAnalysisTaskDetailResponseBody body;

    public static QueryPushAnalysisTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPushAnalysisTaskDetailResponse self = new QueryPushAnalysisTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryPushAnalysisTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPushAnalysisTaskDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPushAnalysisTaskDetailResponse setBody(QueryPushAnalysisTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPushAnalysisTaskDetailResponseBody getBody() {
        return this.body;
    }

}
