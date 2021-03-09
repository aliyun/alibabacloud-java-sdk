// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateOutboundTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOutboundTaskResponseBody body;

    public static CreateOutboundTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOutboundTaskResponse self = new CreateOutboundTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateOutboundTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOutboundTaskResponse setBody(CreateOutboundTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOutboundTaskResponseBody getBody() {
        return this.body;
    }

}
