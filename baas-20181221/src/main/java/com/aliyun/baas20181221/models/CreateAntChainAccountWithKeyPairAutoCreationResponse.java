// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateAntChainAccountWithKeyPairAutoCreationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAntChainAccountWithKeyPairAutoCreationResponseBody body;

    public static CreateAntChainAccountWithKeyPairAutoCreationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAntChainAccountWithKeyPairAutoCreationResponse self = new CreateAntChainAccountWithKeyPairAutoCreationResponse();
        return TeaModel.build(map, self);
    }

    public CreateAntChainAccountWithKeyPairAutoCreationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAntChainAccountWithKeyPairAutoCreationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAntChainAccountWithKeyPairAutoCreationResponse setBody(CreateAntChainAccountWithKeyPairAutoCreationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAntChainAccountWithKeyPairAutoCreationResponseBody getBody() {
        return this.body;
    }

}
