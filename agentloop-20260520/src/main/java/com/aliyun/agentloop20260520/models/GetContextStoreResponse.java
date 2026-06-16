// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetContextStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetContextStoreResponseBody body;

    public static GetContextStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContextStoreResponse self = new GetContextStoreResponse();
        return TeaModel.build(map, self);
    }

    public GetContextStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContextStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetContextStoreResponse setBody(GetContextStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContextStoreResponseBody getBody() {
        return this.body;
    }

}
