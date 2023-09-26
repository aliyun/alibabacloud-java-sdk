// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class ModifySecretKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySecretKeyResponseBody body;

    public static ModifySecretKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySecretKeyResponse self = new ModifySecretKeyResponse();
        return TeaModel.build(map, self);
    }

    public ModifySecretKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySecretKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySecretKeyResponse setBody(ModifySecretKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySecretKeyResponseBody getBody() {
        return this.body;
    }

}
