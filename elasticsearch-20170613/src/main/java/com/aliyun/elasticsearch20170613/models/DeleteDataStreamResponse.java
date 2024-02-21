// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteDataStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteDataStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataStreamResponse setBody(DeleteDataStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataStreamResponseBody getBody() {
        return this.body;
    }

}
