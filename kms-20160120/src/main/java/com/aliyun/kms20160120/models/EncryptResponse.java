// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class EncryptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EncryptResponseBody body;

    public static EncryptResponse build(java.util.Map<String, ?> map) throws Exception {
        EncryptResponse self = new EncryptResponse();
        return TeaModel.build(map, self);
    }

    public EncryptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EncryptResponse setBody(EncryptResponseBody body) {
        this.body = body;
        return this;
    }
    public EncryptResponseBody getBody() {
        return this.body;
    }

}
