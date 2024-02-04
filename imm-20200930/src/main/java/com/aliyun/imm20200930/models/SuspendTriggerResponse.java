// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SuspendTriggerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SuspendTriggerResponseBody body;

    public static SuspendTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendTriggerResponse self = new SuspendTriggerResponse();
        return TeaModel.build(map, self);
    }

    public SuspendTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendTriggerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SuspendTriggerResponse setBody(SuspendTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendTriggerResponseBody getBody() {
        return this.body;
    }

}
