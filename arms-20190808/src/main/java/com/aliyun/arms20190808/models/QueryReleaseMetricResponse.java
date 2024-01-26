// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryReleaseMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryReleaseMetricResponseBody body;

    public static QueryReleaseMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryReleaseMetricResponse self = new QueryReleaseMetricResponse();
        return TeaModel.build(map, self);
    }

    public QueryReleaseMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryReleaseMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryReleaseMetricResponse setBody(QueryReleaseMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryReleaseMetricResponseBody getBody() {
        return this.body;
    }

}
