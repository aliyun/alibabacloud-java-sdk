// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateEnvPodMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEnvPodMonitorResponseBody body;

    public static UpdateEnvPodMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvPodMonitorResponse self = new UpdateEnvPodMonitorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEnvPodMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEnvPodMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEnvPodMonitorResponse setBody(UpdateEnvPodMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEnvPodMonitorResponseBody getBody() {
        return this.body;
    }

}
