// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListDashboardMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDashboardMetricsResponseBody body;

    public static ListDashboardMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardMetricsResponse self = new ListDashboardMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ListDashboardMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDashboardMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDashboardMetricsResponse setBody(ListDashboardMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDashboardMetricsResponseBody getBody() {
        return this.body;
    }

}
