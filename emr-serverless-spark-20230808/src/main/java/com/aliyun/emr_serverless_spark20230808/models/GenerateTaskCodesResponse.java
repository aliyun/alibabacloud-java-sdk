// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GenerateTaskCodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateTaskCodesResponseBody body;

    public static GenerateTaskCodesResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateTaskCodesResponse self = new GenerateTaskCodesResponse();
        return TeaModel.build(map, self);
    }

    public GenerateTaskCodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateTaskCodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateTaskCodesResponse setBody(GenerateTaskCodesResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateTaskCodesResponseBody getBody() {
        return this.body;
    }

}
