// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aigen20240111.models;

import com.aliyun.tea.*;

public class GenerateTextTextureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateTextTextureResponseBody body;

    public static GenerateTextTextureResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateTextTextureResponse self = new GenerateTextTextureResponse();
        return TeaModel.build(map, self);
    }

    public GenerateTextTextureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateTextTextureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateTextTextureResponse setBody(GenerateTextTextureResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateTextTextureResponseBody getBody() {
        return this.body;
    }

}
