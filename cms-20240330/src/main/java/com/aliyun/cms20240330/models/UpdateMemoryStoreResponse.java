// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateMemoryStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMemoryStoreResponseBody body;

    public static UpdateMemoryStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryStoreResponse self = new UpdateMemoryStoreResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMemoryStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMemoryStoreResponse setBody(UpdateMemoryStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMemoryStoreResponseBody getBody() {
        return this.body;
    }

}
