// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class BankMetaVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BankMetaVerifyResponseBody body;

    public static BankMetaVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        BankMetaVerifyResponse self = new BankMetaVerifyResponse();
        return TeaModel.build(map, self);
    }

    public BankMetaVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BankMetaVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BankMetaVerifyResponse setBody(BankMetaVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public BankMetaVerifyResponseBody getBody() {
        return this.body;
    }

}
