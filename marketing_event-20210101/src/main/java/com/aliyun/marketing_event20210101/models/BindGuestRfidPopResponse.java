// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class BindGuestRfidPopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindGuestRfidPopResponseBody body;

    public static BindGuestRfidPopResponse build(java.util.Map<String, ?> map) throws Exception {
        BindGuestRfidPopResponse self = new BindGuestRfidPopResponse();
        return TeaModel.build(map, self);
    }

    public BindGuestRfidPopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindGuestRfidPopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindGuestRfidPopResponse setBody(BindGuestRfidPopResponseBody body) {
        this.body = body;
        return this;
    }
    public BindGuestRfidPopResponseBody getBody() {
        return this.body;
    }

}
