// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class CreateStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStoreResponseBody body;

    public static CreateStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStoreResponse self = new CreateStoreResponse();
        return TeaModel.build(map, self);
    }

    public CreateStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStoreResponse setBody(CreateStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStoreResponseBody getBody() {
        return this.body;
    }

}
