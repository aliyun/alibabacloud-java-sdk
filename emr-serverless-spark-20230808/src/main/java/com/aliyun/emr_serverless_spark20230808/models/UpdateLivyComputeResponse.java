// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class UpdateLivyComputeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLivyComputeResponseBody body;

    public static UpdateLivyComputeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLivyComputeResponse self = new UpdateLivyComputeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLivyComputeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLivyComputeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLivyComputeResponse setBody(UpdateLivyComputeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLivyComputeResponseBody getBody() {
        return this.body;
    }

}
