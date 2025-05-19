// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryMetricMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMetricMetaResponseBody body;

    public static QueryMetricMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricMetaResponse self = new QueryMetricMetaResponse();
        return TeaModel.build(map, self);
    }

    public QueryMetricMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMetricMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMetricMetaResponse setBody(QueryMetricMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMetricMetaResponseBody getBody() {
        return this.body;
    }

}
