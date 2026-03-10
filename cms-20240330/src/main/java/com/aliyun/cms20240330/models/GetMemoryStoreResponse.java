// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetMemoryStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMemoryStoreResponseBody body;

    public static GetMemoryStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryStoreResponse self = new GetMemoryStoreResponse();
        return TeaModel.build(map, self);
    }

    public GetMemoryStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMemoryStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMemoryStoreResponse setBody(GetMemoryStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMemoryStoreResponseBody getBody() {
        return this.body;
    }

}
