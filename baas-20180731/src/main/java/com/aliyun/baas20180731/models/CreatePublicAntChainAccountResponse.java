// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreatePublicAntChainAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePublicAntChainAccountResponseBody body;

    public static CreatePublicAntChainAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePublicAntChainAccountResponse self = new CreatePublicAntChainAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreatePublicAntChainAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePublicAntChainAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePublicAntChainAccountResponse setBody(CreatePublicAntChainAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePublicAntChainAccountResponseBody getBody() {
        return this.body;
    }

}
