// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CreateSecretKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSecretKeyResponseBody body;

    public static CreateSecretKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSecretKeyResponse self = new CreateSecretKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateSecretKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSecretKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSecretKeyResponse setBody(CreateSecretKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSecretKeyResponseBody getBody() {
        return this.body;
    }

}
