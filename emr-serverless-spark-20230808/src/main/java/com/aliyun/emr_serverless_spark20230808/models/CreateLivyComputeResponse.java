// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateLivyComputeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLivyComputeResponseBody body;

    public static CreateLivyComputeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLivyComputeResponse self = new CreateLivyComputeResponse();
        return TeaModel.build(map, self);
    }

    public CreateLivyComputeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLivyComputeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLivyComputeResponse setBody(CreateLivyComputeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLivyComputeResponseBody getBody() {
        return this.body;
    }

}
