// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryUserUsageReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryUserUsageReportResponseBody body;

    public static QueryUserUsageReportResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserUsageReportResponse self = new QueryUserUsageReportResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserUsageReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserUsageReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUserUsageReportResponse setBody(QueryUserUsageReportResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserUsageReportResponseBody getBody() {
        return this.body;
    }

}
