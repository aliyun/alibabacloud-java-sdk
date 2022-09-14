// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class QueryHotlineDashboardInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHotlineDashboardInfoResponseBody body;

    public static QueryHotlineDashboardInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHotlineDashboardInfoResponse self = new QueryHotlineDashboardInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryHotlineDashboardInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHotlineDashboardInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryHotlineDashboardInfoResponse setBody(QueryHotlineDashboardInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHotlineDashboardInfoResponseBody getBody() {
        return this.body;
    }

}
