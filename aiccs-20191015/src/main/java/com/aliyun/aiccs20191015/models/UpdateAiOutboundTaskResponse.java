// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateAiOutboundTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAiOutboundTaskResponseBody body;

    public static UpdateAiOutboundTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiOutboundTaskResponse self = new UpdateAiOutboundTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAiOutboundTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAiOutboundTaskResponse setBody(UpdateAiOutboundTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAiOutboundTaskResponseBody getBody() {
        return this.body;
    }

}
