// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricEncryptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AsymmetricEncryptResponseBody body;

    public static AsymmetricEncryptResponse build(java.util.Map<String, ?> map) throws Exception {
        AsymmetricEncryptResponse self = new AsymmetricEncryptResponse();
        return TeaModel.build(map, self);
    }

    public AsymmetricEncryptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AsymmetricEncryptResponse setBody(AsymmetricEncryptResponseBody body) {
        this.body = body;
        return this;
    }
    public AsymmetricEncryptResponseBody getBody() {
        return this.body;
    }

}
