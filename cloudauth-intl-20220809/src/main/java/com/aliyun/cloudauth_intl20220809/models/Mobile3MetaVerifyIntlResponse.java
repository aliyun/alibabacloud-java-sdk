// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class Mobile3MetaVerifyIntlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Mobile3MetaVerifyIntlResponseBody body;

    public static Mobile3MetaVerifyIntlResponse build(java.util.Map<String, ?> map) throws Exception {
        Mobile3MetaVerifyIntlResponse self = new Mobile3MetaVerifyIntlResponse();
        return TeaModel.build(map, self);
    }

    public Mobile3MetaVerifyIntlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Mobile3MetaVerifyIntlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Mobile3MetaVerifyIntlResponse setBody(Mobile3MetaVerifyIntlResponseBody body) {
        this.body = body;
        return this;
    }
    public Mobile3MetaVerifyIntlResponseBody getBody() {
        return this.body;
    }

}
