// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CheckReplyToMailAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckReplyToMailAddressResponseBody body;

    public static CheckReplyToMailAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckReplyToMailAddressResponse self = new CheckReplyToMailAddressResponse();
        return TeaModel.build(map, self);
    }

    public CheckReplyToMailAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckReplyToMailAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckReplyToMailAddressResponse setBody(CheckReplyToMailAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckReplyToMailAddressResponseBody getBody() {
        return this.body;
    }

}
