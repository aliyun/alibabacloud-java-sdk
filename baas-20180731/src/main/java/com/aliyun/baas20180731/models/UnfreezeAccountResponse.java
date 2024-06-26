// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UnfreezeAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnfreezeAccountResponseBody body;

    public static UnfreezeAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        UnfreezeAccountResponse self = new UnfreezeAccountResponse();
        return TeaModel.build(map, self);
    }

    public UnfreezeAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnfreezeAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnfreezeAccountResponse setBody(UnfreezeAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public UnfreezeAccountResponseBody getBody() {
        return this.body;
    }

}
