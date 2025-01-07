// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Mobile3MetaSimpleStandardVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Mobile3MetaSimpleStandardVerifyResponseBody body;

    public static Mobile3MetaSimpleStandardVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        Mobile3MetaSimpleStandardVerifyResponse self = new Mobile3MetaSimpleStandardVerifyResponse();
        return TeaModel.build(map, self);
    }

    public Mobile3MetaSimpleStandardVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Mobile3MetaSimpleStandardVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Mobile3MetaSimpleStandardVerifyResponse setBody(Mobile3MetaSimpleStandardVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public Mobile3MetaSimpleStandardVerifyResponseBody getBody() {
        return this.body;
    }

}
