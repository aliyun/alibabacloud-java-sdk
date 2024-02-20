// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateCartoonizedImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateCartoonizedImageResponseBody body;

    public static GenerateCartoonizedImageResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateCartoonizedImageResponse self = new GenerateCartoonizedImageResponse();
        return TeaModel.build(map, self);
    }

    public GenerateCartoonizedImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateCartoonizedImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateCartoonizedImageResponse setBody(GenerateCartoonizedImageResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateCartoonizedImageResponseBody getBody() {
        return this.body;
    }

}
