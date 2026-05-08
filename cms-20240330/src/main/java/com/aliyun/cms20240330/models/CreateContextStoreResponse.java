// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateContextStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateContextStoreResponseBody body;

    public static CreateContextStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContextStoreResponse self = new CreateContextStoreResponse();
        return TeaModel.build(map, self);
    }

    public CreateContextStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateContextStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateContextStoreResponse setBody(CreateContextStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateContextStoreResponseBody getBody() {
        return this.body;
    }

}
