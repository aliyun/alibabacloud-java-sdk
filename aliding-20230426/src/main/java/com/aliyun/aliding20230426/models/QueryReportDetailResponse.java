// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryReportDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryReportDetailResponseBody body;

    public static QueryReportDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryReportDetailResponse self = new QueryReportDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryReportDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryReportDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryReportDetailResponse setBody(QueryReportDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryReportDetailResponseBody getBody() {
        return this.body;
    }

}
