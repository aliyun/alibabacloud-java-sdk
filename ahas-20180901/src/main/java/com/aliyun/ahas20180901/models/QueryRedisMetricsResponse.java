// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryRedisMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRedisMetricsResponseBody body;

    public static QueryRedisMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRedisMetricsResponse self = new QueryRedisMetricsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRedisMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRedisMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRedisMetricsResponse setBody(QueryRedisMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRedisMetricsResponseBody getBody() {
        return this.body;
    }

}
