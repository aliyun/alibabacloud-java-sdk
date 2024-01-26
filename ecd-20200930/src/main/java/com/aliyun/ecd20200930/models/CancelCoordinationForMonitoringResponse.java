// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CancelCoordinationForMonitoringResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelCoordinationForMonitoringResponseBody body;

    public static CancelCoordinationForMonitoringResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelCoordinationForMonitoringResponse self = new CancelCoordinationForMonitoringResponse();
        return TeaModel.build(map, self);
    }

    public CancelCoordinationForMonitoringResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelCoordinationForMonitoringResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelCoordinationForMonitoringResponse setBody(CancelCoordinationForMonitoringResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelCoordinationForMonitoringResponseBody getBody() {
        return this.body;
    }

}
