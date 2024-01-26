// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListDashboardsByNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDashboardsByNameResponseBody body;

    public static ListDashboardsByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardsByNameResponse self = new ListDashboardsByNameResponse();
        return TeaModel.build(map, self);
    }

    public ListDashboardsByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDashboardsByNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDashboardsByNameResponse setBody(ListDashboardsByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDashboardsByNameResponseBody getBody() {
        return this.body;
    }

}
