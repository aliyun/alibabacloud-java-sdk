// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteEnvPodMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEnvPodMonitorResponseBody body;

    public static DeleteEnvPodMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnvPodMonitorResponse self = new DeleteEnvPodMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEnvPodMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEnvPodMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEnvPodMonitorResponse setBody(DeleteEnvPodMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEnvPodMonitorResponseBody getBody() {
        return this.body;
    }

}
