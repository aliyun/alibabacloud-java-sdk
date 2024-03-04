// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GenerateFileUrlByKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateFileUrlByKeyResponseBody body;

    public static GenerateFileUrlByKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateFileUrlByKeyResponse self = new GenerateFileUrlByKeyResponse();
        return TeaModel.build(map, self);
    }

    public GenerateFileUrlByKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateFileUrlByKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateFileUrlByKeyResponse setBody(GenerateFileUrlByKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateFileUrlByKeyResponseBody getBody() {
        return this.body;
    }

}
