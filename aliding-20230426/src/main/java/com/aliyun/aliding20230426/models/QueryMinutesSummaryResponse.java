// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMinutesSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMinutesSummaryResponseBody body;

    public static QueryMinutesSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMinutesSummaryResponse self = new QueryMinutesSummaryResponse();
        return TeaModel.build(map, self);
    }

    public QueryMinutesSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMinutesSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMinutesSummaryResponse setBody(QueryMinutesSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMinutesSummaryResponseBody getBody() {
        return this.body;
    }

}
