// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ListDashboardsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDashboardsResponseBody body;

    public static ListDashboardsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardsResponse self = new ListDashboardsResponse();
        return TeaModel.build(map, self);
    }

    public ListDashboardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDashboardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDashboardsResponse setBody(ListDashboardsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDashboardsResponseBody getBody() {
        return this.body;
    }

}
