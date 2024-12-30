// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SuspendApsJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SuspendApsJobResponseBody body;

    public static SuspendApsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendApsJobResponse self = new SuspendApsJobResponse();
        return TeaModel.build(map, self);
    }

    public SuspendApsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendApsJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SuspendApsJobResponse setBody(SuspendApsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendApsJobResponseBody getBody() {
        return this.body;
    }

}
