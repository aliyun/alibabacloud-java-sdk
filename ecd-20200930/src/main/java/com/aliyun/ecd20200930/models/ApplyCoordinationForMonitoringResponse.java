// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ApplyCoordinationForMonitoringResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyCoordinationForMonitoringResponseBody body;

    public static ApplyCoordinationForMonitoringResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyCoordinationForMonitoringResponse self = new ApplyCoordinationForMonitoringResponse();
        return TeaModel.build(map, self);
    }

    public ApplyCoordinationForMonitoringResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyCoordinationForMonitoringResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyCoordinationForMonitoringResponse setBody(ApplyCoordinationForMonitoringResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyCoordinationForMonitoringResponseBody getBody() {
        return this.body;
    }

}
