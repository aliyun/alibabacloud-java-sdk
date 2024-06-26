// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateAntChainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAntChainResponseBody body;

    public static CreateAntChainResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAntChainResponse self = new CreateAntChainResponse();
        return TeaModel.build(map, self);
    }

    public CreateAntChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAntChainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAntChainResponse setBody(CreateAntChainResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAntChainResponseBody getBody() {
        return this.body;
    }

}
