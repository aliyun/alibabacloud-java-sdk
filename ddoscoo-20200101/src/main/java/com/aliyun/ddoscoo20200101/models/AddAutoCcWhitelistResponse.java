// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AddAutoCcWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAutoCcWhitelistResponseBody body;

    public static AddAutoCcWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAutoCcWhitelistResponse self = new AddAutoCcWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public AddAutoCcWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAutoCcWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAutoCcWhitelistResponse setBody(AddAutoCcWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAutoCcWhitelistResponseBody getBody() {
        return this.body;
    }

}
