// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class WithdrawServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public WithdrawServiceResponse setBody(WithdrawServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public WithdrawServiceResponseBody getBody() {
        return this.body;
    }

}
