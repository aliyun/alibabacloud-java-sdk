// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateEnvPodMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEnvPodMonitorResponseBody body;

    public static CreateEnvPodMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvPodMonitorResponse self = new CreateEnvPodMonitorResponse();
        return TeaModel.build(map, self);
    }

    public CreateEnvPodMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEnvPodMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEnvPodMonitorResponse setBody(CreateEnvPodMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEnvPodMonitorResponseBody getBody() {
        return this.body;
    }

}
