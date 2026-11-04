// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryDauReportDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDauReportDataResponseBody body;

    public static QueryDauReportDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDauReportDataResponse self = new QueryDauReportDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryDauReportDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDauReportDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDauReportDataResponse setBody(QueryDauReportDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDauReportDataResponseBody getBody() {
        return this.body;
    }

}
