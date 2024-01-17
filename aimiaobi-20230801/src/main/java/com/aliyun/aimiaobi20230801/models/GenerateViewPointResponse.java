// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GenerateViewPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateViewPointResponseBody body;

    public static GenerateViewPointResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateViewPointResponse self = new GenerateViewPointResponse();
        return TeaModel.build(map, self);
    }

    public GenerateViewPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateViewPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateViewPointResponse setBody(GenerateViewPointResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateViewPointResponseBody getBody() {
        return this.body;
    }

}
