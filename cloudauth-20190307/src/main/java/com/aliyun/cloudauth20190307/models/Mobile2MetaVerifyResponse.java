// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Mobile2MetaVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Mobile2MetaVerifyResponseBody body;

    public static Mobile2MetaVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        Mobile2MetaVerifyResponse self = new Mobile2MetaVerifyResponse();
        return TeaModel.build(map, self);
    }

    public Mobile2MetaVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Mobile2MetaVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Mobile2MetaVerifyResponse setBody(Mobile2MetaVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public Mobile2MetaVerifyResponseBody getBody() {
        return this.body;
    }

}
