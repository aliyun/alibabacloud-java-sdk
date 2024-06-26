// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateAccountWithKeyPairAutoCreationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAccountWithKeyPairAutoCreationResponseBody body;

    public static CreateAccountWithKeyPairAutoCreationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountWithKeyPairAutoCreationResponse self = new CreateAccountWithKeyPairAutoCreationResponse();
        return TeaModel.build(map, self);
    }

    public CreateAccountWithKeyPairAutoCreationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAccountWithKeyPairAutoCreationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAccountWithKeyPairAutoCreationResponse setBody(CreateAccountWithKeyPairAutoCreationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAccountWithKeyPairAutoCreationResponseBody getBody() {
        return this.body;
    }

}
