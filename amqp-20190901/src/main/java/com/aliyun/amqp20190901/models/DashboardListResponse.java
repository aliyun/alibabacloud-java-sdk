// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class DashboardListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DashboardListResponseBody body;

    public static DashboardListResponse build(java.util.Map<String, ?> map) throws Exception {
        DashboardListResponse self = new DashboardListResponse();
        return TeaModel.build(map, self);
    }

    public DashboardListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DashboardListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DashboardListResponse setBody(DashboardListResponseBody body) {
        this.body = body;
        return this;
    }
    public DashboardListResponseBody getBody() {
        return this.body;
    }

}
