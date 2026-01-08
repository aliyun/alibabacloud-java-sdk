// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class BindDmAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindDmAccountResponseBody body;

    public static BindDmAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        BindDmAccountResponse self = new BindDmAccountResponse();
        return TeaModel.build(map, self);
    }

    public BindDmAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindDmAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindDmAccountResponse setBody(BindDmAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public BindDmAccountResponseBody getBody() {
        return this.body;
    }

}
