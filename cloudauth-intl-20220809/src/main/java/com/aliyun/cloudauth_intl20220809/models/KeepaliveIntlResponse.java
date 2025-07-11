// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class KeepaliveIntlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public KeepaliveIntlResponseBody body;

    public static KeepaliveIntlResponse build(java.util.Map<String, ?> map) throws Exception {
        KeepaliveIntlResponse self = new KeepaliveIntlResponse();
        return TeaModel.build(map, self);
    }

    public KeepaliveIntlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KeepaliveIntlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public KeepaliveIntlResponse setBody(KeepaliveIntlResponseBody body) {
        this.body = body;
        return this;
    }
    public KeepaliveIntlResponseBody getBody() {
        return this.body;
    }

}
