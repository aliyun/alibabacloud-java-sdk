// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class EmptyAutoCcWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public EmptyAutoCcWhitelistResponse setBody(EmptyAutoCcWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public EmptyAutoCcWhitelistResponseBody getBody() {
        return this.body;
    }

}
