// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class CheckAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckAccountResponseBody body;

    public static CheckAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAccountResponse self = new CheckAccountResponse();
        return TeaModel.build(map, self);
    }

    public CheckAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckAccountResponse setBody(CheckAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAccountResponseBody getBody() {
        return this.body;
    }

}
