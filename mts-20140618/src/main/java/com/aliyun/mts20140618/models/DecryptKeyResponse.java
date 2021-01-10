// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DecryptKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DecryptKeyResponseBody body;

    public static DecryptKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DecryptKeyResponse self = new DecryptKeyResponse();
        return TeaModel.build(map, self);
    }

    public DecryptKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DecryptKeyResponse setBody(DecryptKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DecryptKeyResponseBody getBody() {
        return this.body;
    }

}
