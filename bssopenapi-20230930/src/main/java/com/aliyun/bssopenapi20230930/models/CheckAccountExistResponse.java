// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CheckAccountExistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckAccountExistResponseBody body;

    public static CheckAccountExistResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAccountExistResponse self = new CheckAccountExistResponse();
        return TeaModel.build(map, self);
    }

    public CheckAccountExistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAccountExistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckAccountExistResponse setBody(CheckAccountExistResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAccountExistResponseBody getBody() {
        return this.body;
    }

}
