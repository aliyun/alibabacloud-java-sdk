// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class SignContractResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SignContractResponseBody body;

    public static SignContractResponse build(java.util.Map<String, ?> map) throws Exception {
        SignContractResponse self = new SignContractResponse();
        return TeaModel.build(map, self);
    }

    public SignContractResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SignContractResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SignContractResponse setBody(SignContractResponseBody body) {
        this.body = body;
        return this;
    }
    public SignContractResponseBody getBody() {
        return this.body;
    }

}
