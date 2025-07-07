// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class DeleteLivyComputeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLivyComputeResponseBody body;

    public static DeleteLivyComputeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLivyComputeResponse self = new DeleteLivyComputeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLivyComputeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLivyComputeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLivyComputeResponse setBody(DeleteLivyComputeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLivyComputeResponseBody getBody() {
        return this.body;
    }

}
