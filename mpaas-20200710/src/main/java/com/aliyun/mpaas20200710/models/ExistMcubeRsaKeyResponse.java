// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class ExistMcubeRsaKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExistMcubeRsaKeyResponseBody body;

    public static ExistMcubeRsaKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ExistMcubeRsaKeyResponse self = new ExistMcubeRsaKeyResponse();
        return TeaModel.build(map, self);
    }

    public ExistMcubeRsaKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExistMcubeRsaKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExistMcubeRsaKeyResponse setBody(ExistMcubeRsaKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ExistMcubeRsaKeyResponseBody getBody() {
        return this.body;
    }

}
