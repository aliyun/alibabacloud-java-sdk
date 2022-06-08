// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateSecretResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSecretResponseBody body;

    public static UpdateSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretResponse self = new UpdateSecretResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSecretResponse setBody(UpdateSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSecretResponseBody getBody() {
        return this.body;
    }

}
