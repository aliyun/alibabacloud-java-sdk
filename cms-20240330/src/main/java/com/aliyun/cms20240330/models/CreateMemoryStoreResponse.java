// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateMemoryStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMemoryStoreResponseBody body;

    public static CreateMemoryStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryStoreResponse self = new CreateMemoryStoreResponse();
        return TeaModel.build(map, self);
    }

    public CreateMemoryStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMemoryStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMemoryStoreResponse setBody(CreateMemoryStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMemoryStoreResponseBody getBody() {
        return this.body;
    }

}
