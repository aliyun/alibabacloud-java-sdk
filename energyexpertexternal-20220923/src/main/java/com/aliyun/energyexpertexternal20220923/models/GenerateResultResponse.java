// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GenerateResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateResultResponseBody body;

    public static GenerateResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateResultResponse self = new GenerateResultResponse();
        return TeaModel.build(map, self);
    }

    public GenerateResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateResultResponse setBody(GenerateResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateResultResponseBody getBody() {
        return this.body;
    }

}
