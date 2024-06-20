// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateAntChainKmsAccountNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAntChainKmsAccountNewResponseBody body;

    public static CreateAntChainKmsAccountNewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAntChainKmsAccountNewResponse self = new CreateAntChainKmsAccountNewResponse();
        return TeaModel.build(map, self);
    }

    public CreateAntChainKmsAccountNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAntChainKmsAccountNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAntChainKmsAccountNewResponse setBody(CreateAntChainKmsAccountNewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAntChainKmsAccountNewResponseBody getBody() {
        return this.body;
    }

}
