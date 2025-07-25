// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateLivyComputeTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLivyComputeTokenResponseBody body;

    public static CreateLivyComputeTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLivyComputeTokenResponse self = new CreateLivyComputeTokenResponse();
        return TeaModel.build(map, self);
    }

    public CreateLivyComputeTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLivyComputeTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLivyComputeTokenResponse setBody(CreateLivyComputeTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLivyComputeTokenResponseBody getBody() {
        return this.body;
    }

}
