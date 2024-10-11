// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListDashboardDetailsFlowsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDashboardDetailsFlowsResponseBody body;

    public static ListDashboardDetailsFlowsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardDetailsFlowsResponse self = new ListDashboardDetailsFlowsResponse();
        return TeaModel.build(map, self);
    }

    public ListDashboardDetailsFlowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDashboardDetailsFlowsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDashboardDetailsFlowsResponse setBody(ListDashboardDetailsFlowsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDashboardDetailsFlowsResponseBody getBody() {
        return this.body;
    }

}
