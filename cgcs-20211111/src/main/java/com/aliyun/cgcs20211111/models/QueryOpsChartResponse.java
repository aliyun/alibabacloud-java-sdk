// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class QueryOpsChartResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOpsChartResponseBody body;

    public static QueryOpsChartResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOpsChartResponse self = new QueryOpsChartResponse();
        return TeaModel.build(map, self);
    }

    public QueryOpsChartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOpsChartResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOpsChartResponse setBody(QueryOpsChartResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOpsChartResponseBody getBody() {
        return this.body;
    }

}
