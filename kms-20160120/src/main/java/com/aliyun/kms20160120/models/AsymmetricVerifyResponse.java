// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricVerifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AsymmetricVerifyResponseBody body;

    public static AsymmetricVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        AsymmetricVerifyResponse self = new AsymmetricVerifyResponse();
        return TeaModel.build(map, self);
    }

    public AsymmetricVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AsymmetricVerifyResponse setBody(AsymmetricVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public AsymmetricVerifyResponseBody getBody() {
        return this.body;
    }

}
