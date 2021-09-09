// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteDataStreamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDataStreamResponseBody body;

    public static DeleteDataStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataStreamResponse self = new DeleteDataStreamResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataStreamResponse setBody(DeleteDataStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataStreamResponseBody getBody() {
        return this.body;
    }

}
