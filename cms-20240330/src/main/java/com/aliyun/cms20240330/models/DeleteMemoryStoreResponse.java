// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteMemoryStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMemoryStoreResponseBody body;

    public static DeleteMemoryStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMemoryStoreResponse self = new DeleteMemoryStoreResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMemoryStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMemoryStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMemoryStoreResponse setBody(DeleteMemoryStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMemoryStoreResponseBody getBody() {
        return this.body;
    }

}
