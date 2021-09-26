// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class StopAiOutboundTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopAiOutboundTaskResponseBody body;

    public static StopAiOutboundTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopAiOutboundTaskResponse self = new StopAiOutboundTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopAiOutboundTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopAiOutboundTaskResponse setBody(StopAiOutboundTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopAiOutboundTaskResponseBody getBody() {
        return this.body;
    }

}
