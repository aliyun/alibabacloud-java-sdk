// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Mobile3MetaSimpleVerifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public Mobile3MetaSimpleVerifyResponseBody body;

    public static Mobile3MetaSimpleVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        Mobile3MetaSimpleVerifyResponse self = new Mobile3MetaSimpleVerifyResponse();
        return TeaModel.build(map, self);
    }

    public Mobile3MetaSimpleVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Mobile3MetaSimpleVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Mobile3MetaSimpleVerifyResponse setBody(Mobile3MetaSimpleVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public Mobile3MetaSimpleVerifyResponseBody getBody() {
        return this.body;
    }

}
