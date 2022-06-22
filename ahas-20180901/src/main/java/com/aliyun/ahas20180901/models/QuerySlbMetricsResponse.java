// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySlbMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySlbMetricsResponseBody body;

    public static QuerySlbMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySlbMetricsResponse self = new QuerySlbMetricsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySlbMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySlbMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySlbMetricsResponse setBody(QuerySlbMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySlbMetricsResponseBody getBody() {
        return this.body;
    }

}
