// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryRdsMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRdsMetricsResponseBody body;

    public static QueryRdsMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRdsMetricsResponse self = new QueryRdsMetricsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRdsMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRdsMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRdsMetricsResponse setBody(QueryRdsMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRdsMetricsResponseBody getBody() {
        return this.body;
    }

}
