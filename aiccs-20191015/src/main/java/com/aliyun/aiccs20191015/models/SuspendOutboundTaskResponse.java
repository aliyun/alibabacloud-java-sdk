// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class SuspendOutboundTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SuspendOutboundTaskResponseBody body;

    public static SuspendOutboundTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendOutboundTaskResponse self = new SuspendOutboundTaskResponse();
        return TeaModel.build(map, self);
    }

    public SuspendOutboundTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendOutboundTaskResponse setBody(SuspendOutboundTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendOutboundTaskResponseBody getBody() {
        return this.body;
    }

}
