// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateAiOutboundTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAiOutboundTaskResponseBody body;

    public static CreateAiOutboundTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAiOutboundTaskResponse self = new CreateAiOutboundTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateAiOutboundTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAiOutboundTaskResponse setBody(CreateAiOutboundTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAiOutboundTaskResponseBody getBody() {
        return this.body;
    }

}
