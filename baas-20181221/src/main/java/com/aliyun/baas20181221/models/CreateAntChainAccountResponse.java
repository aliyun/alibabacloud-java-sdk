// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateAntChainAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAntChainAccountResponseBody body;

    public static CreateAntChainAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAntChainAccountResponse self = new CreateAntChainAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateAntChainAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAntChainAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAntChainAccountResponse setBody(CreateAntChainAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAntChainAccountResponseBody getBody() {
        return this.body;
    }

}
