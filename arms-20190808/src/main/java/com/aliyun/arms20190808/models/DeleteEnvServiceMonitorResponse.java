// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteEnvServiceMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEnvServiceMonitorResponseBody body;

    public static DeleteEnvServiceMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnvServiceMonitorResponse self = new DeleteEnvServiceMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEnvServiceMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEnvServiceMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEnvServiceMonitorResponse setBody(DeleteEnvServiceMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEnvServiceMonitorResponseBody getBody() {
        return this.body;
    }

}
