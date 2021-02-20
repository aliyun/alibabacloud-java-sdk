// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AddAutoCcWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddAutoCcWhitelistResponse setBody(AddAutoCcWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAutoCcWhitelistResponseBody getBody() {
        return this.body;
    }

}
