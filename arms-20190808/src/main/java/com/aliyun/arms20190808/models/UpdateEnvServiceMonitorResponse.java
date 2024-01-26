// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateEnvServiceMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEnvServiceMonitorResponseBody body;

    public static UpdateEnvServiceMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvServiceMonitorResponse self = new UpdateEnvServiceMonitorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEnvServiceMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEnvServiceMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEnvServiceMonitorResponse setBody(UpdateEnvServiceMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEnvServiceMonitorResponseBody getBody() {
        return this.body;
    }

}
