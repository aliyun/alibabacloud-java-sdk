// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class BlackOperateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BlackOperateResponseBody body;

    public static BlackOperateResponse build(java.util.Map<String, ?> map) throws Exception {
        BlackOperateResponse self = new BlackOperateResponse();
        return TeaModel.build(map, self);
    }

    public BlackOperateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BlackOperateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BlackOperateResponse setBody(BlackOperateResponseBody body) {
        this.body = body;
        return this;
    }
    public BlackOperateResponseBody getBody() {
        return this.body;
    }

}
