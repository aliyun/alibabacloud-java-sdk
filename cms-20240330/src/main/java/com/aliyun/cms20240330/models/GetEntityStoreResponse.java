// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetEntityStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEntityStoreResponseBody body;

    public static GetEntityStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEntityStoreResponse self = new GetEntityStoreResponse();
        return TeaModel.build(map, self);
    }

    public GetEntityStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEntityStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEntityStoreResponse setBody(GetEntityStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEntityStoreResponseBody getBody() {
        return this.body;
    }

}
