// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryNetworkRttReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryNetworkRttReportResponseBody body;

    public static QueryNetworkRttReportResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNetworkRttReportResponse self = new QueryNetworkRttReportResponse();
        return TeaModel.build(map, self);
    }

    public QueryNetworkRttReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryNetworkRttReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryNetworkRttReportResponse setBody(QueryNetworkRttReportResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryNetworkRttReportResponseBody getBody() {
        return this.body;
    }

}
