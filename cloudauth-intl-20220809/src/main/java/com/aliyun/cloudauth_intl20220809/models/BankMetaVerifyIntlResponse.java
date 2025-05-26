// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class BankMetaVerifyIntlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BankMetaVerifyIntlResponseBody body;

    public static BankMetaVerifyIntlResponse build(java.util.Map<String, ?> map) throws Exception {
        BankMetaVerifyIntlResponse self = new BankMetaVerifyIntlResponse();
        return TeaModel.build(map, self);
    }

    public BankMetaVerifyIntlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BankMetaVerifyIntlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BankMetaVerifyIntlResponse setBody(BankMetaVerifyIntlResponseBody body) {
        this.body = body;
        return this;
    }
    public BankMetaVerifyIntlResponseBody getBody() {
        return this.body;
    }

}
