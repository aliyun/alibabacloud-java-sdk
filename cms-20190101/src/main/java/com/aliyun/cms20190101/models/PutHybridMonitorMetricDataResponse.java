// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutHybridMonitorMetricDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutHybridMonitorMetricDataResponseBody body;

    public static PutHybridMonitorMetricDataResponse build(java.util.Map<String, ?> map) throws Exception {
        PutHybridMonitorMetricDataResponse self = new PutHybridMonitorMetricDataResponse();
        return TeaModel.build(map, self);
    }

    public PutHybridMonitorMetricDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutHybridMonitorMetricDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutHybridMonitorMetricDataResponse setBody(PutHybridMonitorMetricDataResponseBody body) {
        this.body = body;
        return this;
    }
    public PutHybridMonitorMetricDataResponseBody getBody() {
        return this.body;
    }

}
