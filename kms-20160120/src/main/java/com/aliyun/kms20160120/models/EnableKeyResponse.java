// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class EnableKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableKeyResponseBody body;

    public static EnableKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableKeyResponse self = new EnableKeyResponse();
        return TeaModel.build(map, self);
    }

    public EnableKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableKeyResponse setBody(EnableKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableKeyResponseBody getBody() {
        return this.body;
    }

}
