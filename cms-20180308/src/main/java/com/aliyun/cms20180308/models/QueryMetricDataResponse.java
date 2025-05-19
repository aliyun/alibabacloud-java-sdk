// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryMetricDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMetricDataResponseBody body;

    public static QueryMetricDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricDataResponse self = new QueryMetricDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryMetricDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMetricDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMetricDataResponse setBody(QueryMetricDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMetricDataResponseBody getBody() {
        return this.body;
    }

}
