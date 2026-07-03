// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class IdnAuthorityVerifyIntlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IdnAuthorityVerifyIntlResponseBody body;

    public static IdnAuthorityVerifyIntlResponse build(java.util.Map<String, ?> map) throws Exception {
        IdnAuthorityVerifyIntlResponse self = new IdnAuthorityVerifyIntlResponse();
        return TeaModel.build(map, self);
    }

    public IdnAuthorityVerifyIntlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IdnAuthorityVerifyIntlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IdnAuthorityVerifyIntlResponse setBody(IdnAuthorityVerifyIntlResponseBody body) {
        this.body = body;
        return this;
    }
    public IdnAuthorityVerifyIntlResponseBody getBody() {
        return this.body;
    }

}
