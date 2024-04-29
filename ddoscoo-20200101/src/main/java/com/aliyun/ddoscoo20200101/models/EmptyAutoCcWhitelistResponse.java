// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class EmptyAutoCcWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EmptyAutoCcWhitelistResponseBody body;

    public static EmptyAutoCcWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        EmptyAutoCcWhitelistResponse self = new EmptyAutoCcWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public EmptyAutoCcWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EmptyAutoCcWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EmptyAutoCcWhitelistResponse setBody(EmptyAutoCcWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public EmptyAutoCcWhitelistResponseBody getBody() {
        return this.body;
    }

}
