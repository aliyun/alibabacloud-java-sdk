// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAddOrUpdateMonitorDashboardItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelAddOrUpdateMonitorDashboardItemsResponseBody body;

    public static SentinelAddOrUpdateMonitorDashboardItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelAddOrUpdateMonitorDashboardItemsResponse self = new SentinelAddOrUpdateMonitorDashboardItemsResponse();
        return TeaModel.build(map, self);
    }

    public SentinelAddOrUpdateMonitorDashboardItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelAddOrUpdateMonitorDashboardItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelAddOrUpdateMonitorDashboardItemsResponse setBody(SentinelAddOrUpdateMonitorDashboardItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelAddOrUpdateMonitorDashboardItemsResponseBody getBody() {
        return this.body;
    }

}
