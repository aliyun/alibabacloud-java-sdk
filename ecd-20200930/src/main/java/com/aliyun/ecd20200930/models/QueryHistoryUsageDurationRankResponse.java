// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryHistoryUsageDurationRankResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryHistoryUsageDurationRankResponseBody body;

    public static QueryHistoryUsageDurationRankResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHistoryUsageDurationRankResponse self = new QueryHistoryUsageDurationRankResponse();
        return TeaModel.build(map, self);
    }

    public QueryHistoryUsageDurationRankResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHistoryUsageDurationRankResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryHistoryUsageDurationRankResponse setBody(QueryHistoryUsageDurationRankResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHistoryUsageDurationRankResponseBody getBody() {
        return this.body;
    }

}
