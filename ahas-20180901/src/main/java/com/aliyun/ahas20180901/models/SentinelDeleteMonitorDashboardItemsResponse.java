// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelDeleteMonitorDashboardItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelDeleteMonitorDashboardItemsResponseBody body;

    public static SentinelDeleteMonitorDashboardItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelDeleteMonitorDashboardItemsResponse self = new SentinelDeleteMonitorDashboardItemsResponse();
        return TeaModel.build(map, self);
    }

    public SentinelDeleteMonitorDashboardItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelDeleteMonitorDashboardItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelDeleteMonitorDashboardItemsResponse setBody(SentinelDeleteMonitorDashboardItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelDeleteMonitorDashboardItemsResponseBody getBody() {
        return this.body;
    }

}
