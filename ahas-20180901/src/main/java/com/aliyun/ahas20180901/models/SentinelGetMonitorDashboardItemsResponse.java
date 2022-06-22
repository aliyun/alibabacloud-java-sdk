// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGetMonitorDashboardItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelGetMonitorDashboardItemsResponseBody body;

    public static SentinelGetMonitorDashboardItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelGetMonitorDashboardItemsResponse self = new SentinelGetMonitorDashboardItemsResponse();
        return TeaModel.build(map, self);
    }

    public SentinelGetMonitorDashboardItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelGetMonitorDashboardItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelGetMonitorDashboardItemsResponse setBody(SentinelGetMonitorDashboardItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelGetMonitorDashboardItemsResponseBody getBody() {
        return this.body;
    }

}
