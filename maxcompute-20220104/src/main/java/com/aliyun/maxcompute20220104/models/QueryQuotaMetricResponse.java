// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class QueryQuotaMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryQuotaMetricResponseBody body;

    public static QueryQuotaMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryQuotaMetricResponse self = new QueryQuotaMetricResponse();
        return TeaModel.build(map, self);
    }

    public QueryQuotaMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryQuotaMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryQuotaMetricResponse setBody(QueryQuotaMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryQuotaMetricResponseBody getBody() {
        return this.body;
    }

}
