// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListDashboardDetailsFlowsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListDashboardDetailsFlowsResponse setBody(ListDashboardDetailsFlowsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDashboardDetailsFlowsResponseBody getBody() {
        return this.body;
    }

}
