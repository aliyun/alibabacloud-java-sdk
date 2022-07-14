// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryAnalysisJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
