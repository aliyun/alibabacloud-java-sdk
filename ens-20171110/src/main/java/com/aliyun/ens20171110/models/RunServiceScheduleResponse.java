// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RunServiceScheduleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RunServiceScheduleResponse setBody(RunServiceScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public RunServiceScheduleResponseBody getBody() {
        return this.body;
    }

}
