// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteMixStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMixStreamResponseBody body;

    public static DeleteMixStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMixStreamResponse self = new DeleteMixStreamResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMixStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMixStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMixStreamResponse setBody(DeleteMixStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMixStreamResponseBody getBody() {
        return this.body;
    }

}
