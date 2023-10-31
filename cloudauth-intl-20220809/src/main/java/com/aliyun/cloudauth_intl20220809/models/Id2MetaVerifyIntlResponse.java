// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class Id2MetaVerifyIntlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public Id2MetaVerifyIntlResponseBody body;

    public static Id2MetaVerifyIntlResponse build(java.util.Map<String, ?> map) throws Exception {
        Id2MetaVerifyIntlResponse self = new Id2MetaVerifyIntlResponse();
        return TeaModel.build(map, self);
    }

    public Id2MetaVerifyIntlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Id2MetaVerifyIntlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Id2MetaVerifyIntlResponse setBody(Id2MetaVerifyIntlResponseBody body) {
        this.body = body;
        return this;
    }
    public Id2MetaVerifyIntlResponseBody getBody() {
        return this.body;
    }

}
