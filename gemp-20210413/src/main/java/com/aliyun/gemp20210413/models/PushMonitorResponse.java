// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class PushMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PushMonitorResponseBody body;

    public static PushMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        PushMonitorResponse self = new PushMonitorResponse();
        return TeaModel.build(map, self);
    }

    public PushMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushMonitorResponse setBody(PushMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public PushMonitorResponseBody getBody() {
        return this.body;
    }

}
