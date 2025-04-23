// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class QueryTunnelMetricDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTunnelMetricDetailResponseBody body;

    public static QueryTunnelMetricDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTunnelMetricDetailResponse self = new QueryTunnelMetricDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryTunnelMetricDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTunnelMetricDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTunnelMetricDetailResponse setBody(QueryTunnelMetricDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTunnelMetricDetailResponseBody getBody() {
        return this.body;
    }

}
