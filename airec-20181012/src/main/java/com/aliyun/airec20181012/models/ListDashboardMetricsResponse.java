// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListDashboardMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListDashboardMetricsResponse setBody(ListDashboardMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDashboardMetricsResponseBody getBody() {
        return this.body;
    }

}
