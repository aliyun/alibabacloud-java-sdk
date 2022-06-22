// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGetMonitorDashboardsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelGetMonitorDashboardsResponseBody body;

    public static SentinelGetMonitorDashboardsResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelGetMonitorDashboardsResponse self = new SentinelGetMonitorDashboardsResponse();
        return TeaModel.build(map, self);
    }

    public SentinelGetMonitorDashboardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelGetMonitorDashboardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelGetMonitorDashboardsResponse setBody(SentinelGetMonitorDashboardsResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelGetMonitorDashboardsResponseBody getBody() {
        return this.body;
    }

}
