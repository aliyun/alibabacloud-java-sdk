// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryMetricListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMetricListResponseBody body;

    public static QueryMetricListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricListResponse self = new QueryMetricListResponse();
        return TeaModel.build(map, self);
    }

    public QueryMetricListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMetricListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMetricListResponse setBody(QueryMetricListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMetricListResponseBody getBody() {
        return this.body;
    }

}
