// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RunServiceScheduleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunServiceScheduleResponseBody body;

    public static RunServiceScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        RunServiceScheduleResponse self = new RunServiceScheduleResponse();
        return TeaModel.build(map, self);
    }

    public RunServiceScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunServiceScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunServiceScheduleResponse setBody(RunServiceScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public RunServiceScheduleResponseBody getBody() {
        return this.body;
    }

}
