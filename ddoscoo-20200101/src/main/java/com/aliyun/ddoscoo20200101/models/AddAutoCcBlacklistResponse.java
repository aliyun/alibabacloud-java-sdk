// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AddAutoCcBlacklistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAutoCcBlacklistResponseBody body;

    public static AddAutoCcBlacklistResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAutoCcBlacklistResponse self = new AddAutoCcBlacklistResponse();
        return TeaModel.build(map, self);
    }

    public AddAutoCcBlacklistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAutoCcBlacklistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAutoCcBlacklistResponse setBody(AddAutoCcBlacklistResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAutoCcBlacklistResponseBody getBody() {
        return this.body;
    }

}
