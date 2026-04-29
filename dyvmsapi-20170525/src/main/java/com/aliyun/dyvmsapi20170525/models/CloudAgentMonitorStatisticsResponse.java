// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudAgentMonitorStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudAgentMonitorStatisticsResponseBody body;

    public static CloudAgentMonitorStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudAgentMonitorStatisticsResponse self = new CloudAgentMonitorStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public CloudAgentMonitorStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudAgentMonitorStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudAgentMonitorStatisticsResponse setBody(CloudAgentMonitorStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudAgentMonitorStatisticsResponseBody getBody() {
        return this.body;
    }

}
