// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetMongoDBCurrentOpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMongoDBCurrentOpResponseBody body;

    public static GetMongoDBCurrentOpResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMongoDBCurrentOpResponse self = new GetMongoDBCurrentOpResponse();
        return TeaModel.build(map, self);
    }

    public GetMongoDBCurrentOpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMongoDBCurrentOpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMongoDBCurrentOpResponse setBody(GetMongoDBCurrentOpResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMongoDBCurrentOpResponseBody getBody() {
        return this.body;
    }

}
