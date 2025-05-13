// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteEntityStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEntityStoreResponseBody body;

    public static DeleteEntityStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEntityStoreResponse self = new DeleteEntityStoreResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEntityStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEntityStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEntityStoreResponse setBody(DeleteEntityStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEntityStoreResponseBody getBody() {
        return this.body;
    }

}
