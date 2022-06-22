// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelDeleteMonitorDashboardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelDeleteMonitorDashboardResponseBody body;

    public static SentinelDeleteMonitorDashboardResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelDeleteMonitorDashboardResponse self = new SentinelDeleteMonitorDashboardResponse();
        return TeaModel.build(map, self);
    }

    public SentinelDeleteMonitorDashboardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelDeleteMonitorDashboardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelDeleteMonitorDashboardResponse setBody(SentinelDeleteMonitorDashboardResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelDeleteMonitorDashboardResponseBody getBody() {
        return this.body;
    }

}
