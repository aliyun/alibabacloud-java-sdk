// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UnbindDmAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindDmAccountResponseBody body;

    public static UnbindDmAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindDmAccountResponse self = new UnbindDmAccountResponse();
        return TeaModel.build(map, self);
    }

    public UnbindDmAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindDmAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindDmAccountResponse setBody(UnbindDmAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindDmAccountResponseBody getBody() {
        return this.body;
    }

}
