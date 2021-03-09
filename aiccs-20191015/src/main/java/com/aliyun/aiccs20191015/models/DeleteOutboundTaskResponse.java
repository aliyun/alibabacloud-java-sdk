// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class DeleteOutboundTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteOutboundTaskResponseBody body;

    public static DeleteOutboundTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOutboundTaskResponse self = new DeleteOutboundTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOutboundTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOutboundTaskResponse setBody(DeleteOutboundTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOutboundTaskResponseBody getBody() {
        return this.body;
    }

}
