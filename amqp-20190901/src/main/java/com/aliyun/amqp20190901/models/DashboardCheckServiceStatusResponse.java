// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class DashboardCheckServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DashboardCheckServiceStatusResponseBody body;

    public static DashboardCheckServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DashboardCheckServiceStatusResponse self = new DashboardCheckServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DashboardCheckServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DashboardCheckServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DashboardCheckServiceStatusResponse setBody(DashboardCheckServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DashboardCheckServiceStatusResponseBody getBody() {
        return this.body;
    }

}
