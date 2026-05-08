// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteContextStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteContextStoreResponseBody body;

    public static DeleteContextStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContextStoreResponse self = new DeleteContextStoreResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContextStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContextStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContextStoreResponse setBody(DeleteContextStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContextStoreResponseBody getBody() {
        return this.body;
    }

}
