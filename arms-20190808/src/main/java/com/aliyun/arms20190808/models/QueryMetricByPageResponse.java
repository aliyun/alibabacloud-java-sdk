// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryMetricByPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMetricByPageResponseBody body;

    public static QueryMetricByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricByPageResponse self = new QueryMetricByPageResponse();
        return TeaModel.build(map, self);
    }

    public QueryMetricByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMetricByPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMetricByPageResponse setBody(QueryMetricByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMetricByPageResponseBody getBody() {
        return this.body;
    }

}
