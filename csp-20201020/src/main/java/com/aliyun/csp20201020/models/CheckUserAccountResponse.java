// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class CheckUserAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckUserAccountResponseBody body;

    public static CheckUserAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckUserAccountResponse self = new CheckUserAccountResponse();
        return TeaModel.build(map, self);
    }

    public CheckUserAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckUserAccountResponse setBody(CheckUserAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckUserAccountResponseBody getBody() {
        return this.body;
    }

}
