// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteChunksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteChunksResponseBody body;

    public static DeleteChunksResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteChunksResponse self = new DeleteChunksResponse();
        return TeaModel.build(map, self);
    }

    public DeleteChunksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteChunksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteChunksResponse setBody(DeleteChunksResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteChunksResponseBody getBody() {
        return this.body;
    }

}
