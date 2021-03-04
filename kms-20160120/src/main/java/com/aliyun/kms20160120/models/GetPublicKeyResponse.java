// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetPublicKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPublicKeyResponseBody body;

    public static GetPublicKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPublicKeyResponse self = new GetPublicKeyResponse();
        return TeaModel.build(map, self);
    }

    public GetPublicKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPublicKeyResponse setBody(GetPublicKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPublicKeyResponseBody getBody() {
        return this.body;
    }

}
