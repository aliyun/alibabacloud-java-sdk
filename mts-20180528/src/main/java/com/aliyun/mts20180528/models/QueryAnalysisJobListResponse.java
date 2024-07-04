// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class QueryAnalysisJobListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAnalysisJobListResponseBody body;

    public static QueryAnalysisJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAnalysisJobListResponse self = new QueryAnalysisJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAnalysisJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAnalysisJobListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAnalysisJobListResponse setBody(QueryAnalysisJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAnalysisJobListResponseBody getBody() {
        return this.body;
    }

}
