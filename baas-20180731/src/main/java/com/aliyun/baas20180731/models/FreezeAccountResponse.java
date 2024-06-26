// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class FreezeAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FreezeAccountResponseBody body;

    public static FreezeAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        FreezeAccountResponse self = new FreezeAccountResponse();
        return TeaModel.build(map, self);
    }

    public FreezeAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FreezeAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FreezeAccountResponse setBody(FreezeAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public FreezeAccountResponseBody getBody() {
        return this.body;
    }

}
