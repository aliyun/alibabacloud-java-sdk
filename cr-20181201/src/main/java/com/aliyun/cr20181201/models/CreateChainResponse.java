// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateChainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateChainResponseBody body;

    public static CreateChainResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateChainResponse self = new CreateChainResponse();
        return TeaModel.build(map, self);
    }

    public CreateChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateChainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateChainResponse setBody(CreateChainResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChainResponseBody getBody() {
        return this.body;
    }

}
