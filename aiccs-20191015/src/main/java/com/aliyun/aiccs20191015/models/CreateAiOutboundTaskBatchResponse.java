// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateAiOutboundTaskBatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAiOutboundTaskBatchResponseBody body;

    public static CreateAiOutboundTaskBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAiOutboundTaskBatchResponse self = new CreateAiOutboundTaskBatchResponse();
        return TeaModel.build(map, self);
    }

    public CreateAiOutboundTaskBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAiOutboundTaskBatchResponse setBody(CreateAiOutboundTaskBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAiOutboundTaskBatchResponseBody getBody() {
        return this.body;
    }

}
