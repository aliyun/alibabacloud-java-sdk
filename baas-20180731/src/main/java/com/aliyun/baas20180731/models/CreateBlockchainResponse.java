// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateBlockchainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBlockchainResponseBody body;

    public static CreateBlockchainResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBlockchainResponse self = new CreateBlockchainResponse();
        return TeaModel.build(map, self);
    }

    public CreateBlockchainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBlockchainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBlockchainResponse setBody(CreateBlockchainResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBlockchainResponseBody getBody() {
        return this.body;
    }

}
