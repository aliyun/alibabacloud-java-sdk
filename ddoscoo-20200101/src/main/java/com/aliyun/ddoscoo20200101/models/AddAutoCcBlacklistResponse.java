// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AddAutoCcBlacklistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddAutoCcBlacklistResponse setBody(AddAutoCcBlacklistResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAutoCcBlacklistResponseBody getBody() {
        return this.body;
    }

}
