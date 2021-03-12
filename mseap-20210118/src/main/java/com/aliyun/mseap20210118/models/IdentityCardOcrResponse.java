// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class IdentityCardOcrResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public IdentityCardOcrResponseBody body;

    public static IdentityCardOcrResponse build(java.util.Map<String, ?> map) throws Exception {
        IdentityCardOcrResponse self = new IdentityCardOcrResponse();
        return TeaModel.build(map, self);
    }

    public IdentityCardOcrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IdentityCardOcrResponse setBody(IdentityCardOcrResponseBody body) {
        this.body = body;
        return this;
    }
    public IdentityCardOcrResponseBody getBody() {
        return this.body;
    }

}
