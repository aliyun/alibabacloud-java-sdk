// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreatePublicAccountWithKeyPairAutoCreationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePublicAccountWithKeyPairAutoCreationResponseBody body;

    public static CreatePublicAccountWithKeyPairAutoCreationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePublicAccountWithKeyPairAutoCreationResponse self = new CreatePublicAccountWithKeyPairAutoCreationResponse();
        return TeaModel.build(map, self);
    }

    public CreatePublicAccountWithKeyPairAutoCreationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePublicAccountWithKeyPairAutoCreationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePublicAccountWithKeyPairAutoCreationResponse setBody(CreatePublicAccountWithKeyPairAutoCreationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePublicAccountWithKeyPairAutoCreationResponseBody getBody() {
        return this.body;
    }

}
