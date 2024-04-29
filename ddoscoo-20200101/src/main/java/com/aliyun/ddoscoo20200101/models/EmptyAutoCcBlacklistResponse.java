// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class EmptyAutoCcBlacklistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EmptyAutoCcBlacklistResponseBody body;

    public static EmptyAutoCcBlacklistResponse build(java.util.Map<String, ?> map) throws Exception {
        EmptyAutoCcBlacklistResponse self = new EmptyAutoCcBlacklistResponse();
        return TeaModel.build(map, self);
    }

    public EmptyAutoCcBlacklistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EmptyAutoCcBlacklistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EmptyAutoCcBlacklistResponse setBody(EmptyAutoCcBlacklistResponseBody body) {
        this.body = body;
        return this;
    }
    public EmptyAutoCcBlacklistResponseBody getBody() {
        return this.body;
    }

}
