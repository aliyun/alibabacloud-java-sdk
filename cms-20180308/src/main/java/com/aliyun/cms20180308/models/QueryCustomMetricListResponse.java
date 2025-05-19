// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryCustomMetricListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCustomMetricListResponseBody body;

    public static QueryCustomMetricListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomMetricListResponse self = new QueryCustomMetricListResponse();
        return TeaModel.build(map, self);
    }

    public QueryCustomMetricListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCustomMetricListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCustomMetricListResponse setBody(QueryCustomMetricListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCustomMetricListResponseBody getBody() {
        return this.body;
    }

}
