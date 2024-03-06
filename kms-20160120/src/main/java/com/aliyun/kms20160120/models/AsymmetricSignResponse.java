// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricSignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AsymmetricSignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AsymmetricSignResponse setBody(AsymmetricSignResponseBody body) {
        this.body = body;
        return this;
    }
    public AsymmetricSignResponseBody getBody() {
        return this.body;
    }

}
