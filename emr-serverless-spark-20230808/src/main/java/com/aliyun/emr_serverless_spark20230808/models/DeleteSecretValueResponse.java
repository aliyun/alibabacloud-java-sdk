// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class DeleteSecretValueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSecretValueResponseBody body;

    public static DeleteSecretValueResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretValueResponse self = new DeleteSecretValueResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSecretValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSecretValueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSecretValueResponse setBody(DeleteSecretValueResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecretValueResponseBody getBody() {
        return this.body;
    }

}
