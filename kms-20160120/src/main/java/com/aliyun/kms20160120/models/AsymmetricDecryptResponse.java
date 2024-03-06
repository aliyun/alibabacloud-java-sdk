// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricDecryptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AsymmetricDecryptResponseBody body;

    public static AsymmetricDecryptResponse build(java.util.Map<String, ?> map) throws Exception {
        AsymmetricDecryptResponse self = new AsymmetricDecryptResponse();
        return TeaModel.build(map, self);
    }

    public AsymmetricDecryptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AsymmetricDecryptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AsymmetricDecryptResponse setBody(AsymmetricDecryptResponseBody body) {
        this.body = body;
        return this;
    }
    public AsymmetricDecryptResponseBody getBody() {
        return this.body;
    }

}
