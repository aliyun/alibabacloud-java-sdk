// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class VerifyIotCardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyIotCardResponseBody body;

    public static VerifyIotCardResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyIotCardResponse self = new VerifyIotCardResponse();
        return TeaModel.build(map, self);
    }

    public VerifyIotCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyIotCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyIotCardResponse setBody(VerifyIotCardResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyIotCardResponseBody getBody() {
        return this.body;
    }

}
