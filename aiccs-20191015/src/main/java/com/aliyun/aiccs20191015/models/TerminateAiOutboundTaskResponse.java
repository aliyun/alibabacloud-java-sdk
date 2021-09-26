// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class TerminateAiOutboundTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TerminateAiOutboundTaskResponseBody body;

    public static TerminateAiOutboundTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        TerminateAiOutboundTaskResponse self = new TerminateAiOutboundTaskResponse();
        return TeaModel.build(map, self);
    }

    public TerminateAiOutboundTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TerminateAiOutboundTaskResponse setBody(TerminateAiOutboundTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public TerminateAiOutboundTaskResponseBody getBody() {
        return this.body;
    }

}
