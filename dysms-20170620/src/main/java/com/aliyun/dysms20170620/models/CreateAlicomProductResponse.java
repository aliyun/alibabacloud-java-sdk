// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateAlicomProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAlicomProductResponseBody body;

    public static CreateAlicomProductResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAlicomProductResponse self = new CreateAlicomProductResponse();
        return TeaModel.build(map, self);
    }

    public CreateAlicomProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAlicomProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAlicomProductResponse setBody(CreateAlicomProductResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAlicomProductResponseBody getBody() {
        return this.body;
    }

}
