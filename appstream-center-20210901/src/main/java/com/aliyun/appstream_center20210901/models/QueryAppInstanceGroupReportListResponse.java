// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryAppInstanceGroupReportListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAppInstanceGroupReportListResponseBody body;

    public static QueryAppInstanceGroupReportListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppInstanceGroupReportListResponse self = new QueryAppInstanceGroupReportListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppInstanceGroupReportListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAppInstanceGroupReportListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAppInstanceGroupReportListResponse setBody(QueryAppInstanceGroupReportListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAppInstanceGroupReportListResponseBody getBody() {
        return this.body;
    }

}
