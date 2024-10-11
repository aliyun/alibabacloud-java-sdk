// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class QuerySingleReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySingleReportResponseBody body;

    public static QuerySingleReportResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySingleReportResponse self = new QuerySingleReportResponse();
        return TeaModel.build(map, self);
    }

    public QuerySingleReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySingleReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySingleReportResponse setBody(QuerySingleReportResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySingleReportResponseBody getBody() {
        return this.body;
    }

}
