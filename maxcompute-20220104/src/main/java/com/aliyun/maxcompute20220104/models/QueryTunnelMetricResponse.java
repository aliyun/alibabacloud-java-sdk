// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class QueryTunnelMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTunnelMetricResponseBody body;

    public static QueryTunnelMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTunnelMetricResponse self = new QueryTunnelMetricResponse();
        return TeaModel.build(map, self);
    }

    public QueryTunnelMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTunnelMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTunnelMetricResponse setBody(QueryTunnelMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTunnelMetricResponseBody getBody() {
        return this.body;
    }

}
