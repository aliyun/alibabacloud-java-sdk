// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class CreatePoolInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePoolInfoResponseBody body;

    public static CreatePoolInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePoolInfoResponse self = new CreatePoolInfoResponse();
        return TeaModel.build(map, self);
    }

    public CreatePoolInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePoolInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePoolInfoResponse setBody(CreatePoolInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePoolInfoResponseBody getBody() {
        return this.body;
    }

}
