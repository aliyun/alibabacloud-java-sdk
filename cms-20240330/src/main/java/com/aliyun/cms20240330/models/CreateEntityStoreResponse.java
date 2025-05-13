// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateEntityStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEntityStoreResponseBody body;

    public static CreateEntityStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEntityStoreResponse self = new CreateEntityStoreResponse();
        return TeaModel.build(map, self);
    }

    public CreateEntityStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEntityStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEntityStoreResponse setBody(CreateEntityStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEntityStoreResponseBody getBody() {
        return this.body;
    }

}
