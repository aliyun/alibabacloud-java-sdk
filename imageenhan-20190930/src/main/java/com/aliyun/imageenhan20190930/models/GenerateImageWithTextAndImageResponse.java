// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateImageWithTextAndImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateImageWithTextAndImageResponseBody body;

    public static GenerateImageWithTextAndImageResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateImageWithTextAndImageResponse self = new GenerateImageWithTextAndImageResponse();
        return TeaModel.build(map, self);
    }

    public GenerateImageWithTextAndImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateImageWithTextAndImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateImageWithTextAndImageResponse setBody(GenerateImageWithTextAndImageResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateImageWithTextAndImageResponseBody getBody() {
        return this.body;
    }

}
