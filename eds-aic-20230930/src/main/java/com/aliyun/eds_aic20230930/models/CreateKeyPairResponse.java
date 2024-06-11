// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateKeyPairResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKeyPairResponseBody body;

    public static CreateKeyPairResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKeyPairResponse self = new CreateKeyPairResponse();
        return TeaModel.build(map, self);
    }

    public CreateKeyPairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKeyPairResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKeyPairResponse setBody(CreateKeyPairResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKeyPairResponseBody getBody() {
        return this.body;
    }

}
