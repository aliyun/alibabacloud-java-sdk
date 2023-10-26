// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateEnvServiceMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEnvServiceMonitorResponseBody body;

    public static CreateEnvServiceMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvServiceMonitorResponse self = new CreateEnvServiceMonitorResponse();
        return TeaModel.build(map, self);
    }

    public CreateEnvServiceMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEnvServiceMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEnvServiceMonitorResponse setBody(CreateEnvServiceMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEnvServiceMonitorResponseBody getBody() {
        return this.body;
    }

}
