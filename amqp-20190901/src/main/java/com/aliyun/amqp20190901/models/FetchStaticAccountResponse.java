// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class FetchStaticAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FetchStaticAccountResponseBody body;

    public static FetchStaticAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        FetchStaticAccountResponse self = new FetchStaticAccountResponse();
        return TeaModel.build(map, self);
    }

    public FetchStaticAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FetchStaticAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FetchStaticAccountResponse setBody(FetchStaticAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public FetchStaticAccountResponseBody getBody() {
        return this.body;
    }

}
