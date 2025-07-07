// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class DeleteLivyComputeTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLivyComputeTokenResponseBody body;

    public static DeleteLivyComputeTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLivyComputeTokenResponse self = new DeleteLivyComputeTokenResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLivyComputeTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLivyComputeTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLivyComputeTokenResponse setBody(DeleteLivyComputeTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLivyComputeTokenResponseBody getBody() {
        return this.body;
    }

}
