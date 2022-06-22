// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelSortMonitorDashboardItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelSortMonitorDashboardItemsResponseBody body;

    public static SentinelSortMonitorDashboardItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelSortMonitorDashboardItemsResponse self = new SentinelSortMonitorDashboardItemsResponse();
        return TeaModel.build(map, self);
    }

    public SentinelSortMonitorDashboardItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelSortMonitorDashboardItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelSortMonitorDashboardItemsResponse setBody(SentinelSortMonitorDashboardItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelSortMonitorDashboardItemsResponseBody getBody() {
        return this.body;
    }

}
