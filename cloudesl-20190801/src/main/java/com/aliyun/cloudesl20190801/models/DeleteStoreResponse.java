// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class DeleteStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStoreResponseBody body;

    public static DeleteStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStoreResponse self = new DeleteStoreResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStoreResponse setBody(DeleteStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStoreResponseBody getBody() {
        return this.body;
    }

}
