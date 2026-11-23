// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateSecretValueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSecretValueResponseBody body;

    public static CreateSecretValueResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSecretValueResponse self = new CreateSecretValueResponse();
        return TeaModel.build(map, self);
    }

    public CreateSecretValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSecretValueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSecretValueResponse setBody(CreateSecretValueResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSecretValueResponseBody getBody() {
        return this.body;
    }

}
