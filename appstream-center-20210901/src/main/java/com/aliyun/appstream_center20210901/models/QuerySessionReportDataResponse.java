// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QuerySessionReportDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySessionReportDataResponseBody body;

    public static QuerySessionReportDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySessionReportDataResponse self = new QuerySessionReportDataResponse();
        return TeaModel.build(map, self);
    }

    public QuerySessionReportDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySessionReportDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySessionReportDataResponse setBody(QuerySessionReportDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySessionReportDataResponseBody getBody() {
        return this.body;
    }

}
