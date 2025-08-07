// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DeleteChunkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteChunkResponseBody body;

    public static DeleteChunkResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteChunkResponse self = new DeleteChunkResponse();
        return TeaModel.build(map, self);
    }

    public DeleteChunkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteChunkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteChunkResponse setBody(DeleteChunkResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteChunkResponseBody getBody() {
        return this.body;
    }

}
