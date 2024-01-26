// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentDashboardsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEnvironmentDashboardsResponseBody body;

    public static ListEnvironmentDashboardsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentDashboardsResponse self = new ListEnvironmentDashboardsResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentDashboardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvironmentDashboardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnvironmentDashboardsResponse setBody(ListEnvironmentDashboardsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvironmentDashboardsResponseBody getBody() {
        return this.body;
    }

}
