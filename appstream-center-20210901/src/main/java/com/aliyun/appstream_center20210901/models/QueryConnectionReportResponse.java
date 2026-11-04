// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryConnectionReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryConnectionReportResponseBody body;

    public static QueryConnectionReportResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConnectionReportResponse self = new QueryConnectionReportResponse();
        return TeaModel.build(map, self);
    }

    public QueryConnectionReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryConnectionReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryConnectionReportResponse setBody(QueryConnectionReportResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryConnectionReportResponseBody getBody() {
        return this.body;
    }

}
