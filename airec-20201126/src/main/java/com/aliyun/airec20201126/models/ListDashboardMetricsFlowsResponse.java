// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListDashboardMetricsFlowsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDashboardMetricsFlowsResponseBody body;

    public static ListDashboardMetricsFlowsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardMetricsFlowsResponse self = new ListDashboardMetricsFlowsResponse();
        return TeaModel.build(map, self);
    }

    public ListDashboardMetricsFlowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDashboardMetricsFlowsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDashboardMetricsFlowsResponse setBody(ListDashboardMetricsFlowsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDashboardMetricsFlowsResponseBody getBody() {
        return this.body;
    }

}
