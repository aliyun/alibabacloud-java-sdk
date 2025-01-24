// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class WithdrawServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WithdrawServiceResponseBody body;

    public static WithdrawServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        WithdrawServiceResponse self = new WithdrawServiceResponse();
        return TeaModel.build(map, self);
    }

    public WithdrawServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WithdrawServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WithdrawServiceResponse setBody(WithdrawServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public WithdrawServiceResponseBody getBody() {
        return this.body;
    }

}
