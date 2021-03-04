// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricSignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AsymmetricSignResponseBody body;

    public static AsymmetricSignResponse build(java.util.Map<String, ?> map) throws Exception {
        AsymmetricSignResponse self = new AsymmetricSignResponse();
        return TeaModel.build(map, self);
    }

    public AsymmetricSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AsymmetricSignResponse setBody(AsymmetricSignResponseBody body) {
        this.body = body;
        return this;
    }
    public AsymmetricSignResponseBody getBody() {
        return this.body;
    }

}
