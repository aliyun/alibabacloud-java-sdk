// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class QueryStorageMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryStorageMetricResponseBody body;

    public static QueryStorageMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStorageMetricResponse self = new QueryStorageMetricResponse();
        return TeaModel.build(map, self);
    }

    public QueryStorageMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStorageMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryStorageMetricResponse setBody(QueryStorageMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStorageMetricResponseBody getBody() {
        return this.body;
    }

}
