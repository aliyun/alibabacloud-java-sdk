// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryEndUserHistoryUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEndUserHistoryUsageResponseBody body;

    public static QueryEndUserHistoryUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEndUserHistoryUsageResponse self = new QueryEndUserHistoryUsageResponse();
        return TeaModel.build(map, self);
    }

    public QueryEndUserHistoryUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEndUserHistoryUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEndUserHistoryUsageResponse setBody(QueryEndUserHistoryUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEndUserHistoryUsageResponseBody getBody() {
        return this.body;
    }

}
