// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMsaEnhanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMsaEnhanceResponseBody body;

    public static CreateMsaEnhanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMsaEnhanceResponse self = new CreateMsaEnhanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateMsaEnhanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMsaEnhanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMsaEnhanceResponse setBody(CreateMsaEnhanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMsaEnhanceResponseBody getBody() {
        return this.body;
    }

}
