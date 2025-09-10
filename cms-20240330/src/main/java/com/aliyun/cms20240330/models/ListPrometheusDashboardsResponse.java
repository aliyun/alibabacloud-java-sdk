// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListPrometheusDashboardsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPrometheusDashboardsResponseBody body;

    public static ListPrometheusDashboardsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusDashboardsResponse self = new ListPrometheusDashboardsResponse();
        return TeaModel.build(map, self);
    }

    public ListPrometheusDashboardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrometheusDashboardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrometheusDashboardsResponse setBody(ListPrometheusDashboardsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrometheusDashboardsResponseBody getBody() {
        return this.body;
    }

}
