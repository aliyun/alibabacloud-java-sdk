// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryNodeReportDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryNodeReportDataResponseBody body;

    public static QueryNodeReportDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNodeReportDataResponse self = new QueryNodeReportDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryNodeReportDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryNodeReportDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryNodeReportDataResponse setBody(QueryNodeReportDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryNodeReportDataResponseBody getBody() {
        return this.body;
    }

}
