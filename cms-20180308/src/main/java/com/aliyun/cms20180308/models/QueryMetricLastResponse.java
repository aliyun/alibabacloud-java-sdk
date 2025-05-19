// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryMetricLastResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMetricLastResponseBody body;

    public static QueryMetricLastResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricLastResponse self = new QueryMetricLastResponse();
        return TeaModel.build(map, self);
    }

    public QueryMetricLastResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMetricLastResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMetricLastResponse setBody(QueryMetricLastResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMetricLastResponseBody getBody() {
        return this.body;
    }

}
