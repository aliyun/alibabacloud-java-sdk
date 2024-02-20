// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateImageWithTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateImageWithTextResponseBody body;

    public static GenerateImageWithTextResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateImageWithTextResponse self = new GenerateImageWithTextResponse();
        return TeaModel.build(map, self);
    }

    public GenerateImageWithTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateImageWithTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateImageWithTextResponse setBody(GenerateImageWithTextResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateImageWithTextResponseBody getBody() {
        return this.body;
    }

}
