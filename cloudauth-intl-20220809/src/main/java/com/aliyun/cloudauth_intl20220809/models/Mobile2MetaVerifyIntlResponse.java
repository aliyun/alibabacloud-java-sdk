// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class Mobile2MetaVerifyIntlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Mobile2MetaVerifyIntlResponseBody body;

    public static Mobile2MetaVerifyIntlResponse build(java.util.Map<String, ?> map) throws Exception {
        Mobile2MetaVerifyIntlResponse self = new Mobile2MetaVerifyIntlResponse();
        return TeaModel.build(map, self);
    }

    public Mobile2MetaVerifyIntlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Mobile2MetaVerifyIntlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Mobile2MetaVerifyIntlResponse setBody(Mobile2MetaVerifyIntlResponseBody body) {
        this.body = body;
        return this;
    }
    public Mobile2MetaVerifyIntlResponseBody getBody() {
        return this.body;
    }

}
