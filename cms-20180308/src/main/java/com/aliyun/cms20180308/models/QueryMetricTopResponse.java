// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryMetricTopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMetricTopResponseBody body;

    public static QueryMetricTopResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricTopResponse self = new QueryMetricTopResponse();
        return TeaModel.build(map, self);
    }

    public QueryMetricTopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMetricTopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMetricTopResponse setBody(QueryMetricTopResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMetricTopResponseBody getBody() {
        return this.body;
    }

}
