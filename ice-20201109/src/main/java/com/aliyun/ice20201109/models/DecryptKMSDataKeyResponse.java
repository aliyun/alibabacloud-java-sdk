// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DecryptKMSDataKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DecryptKMSDataKeyResponseBody body;

    public static DecryptKMSDataKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DecryptKMSDataKeyResponse self = new DecryptKMSDataKeyResponse();
        return TeaModel.build(map, self);
    }

    public DecryptKMSDataKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DecryptKMSDataKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DecryptKMSDataKeyResponse setBody(DecryptKMSDataKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DecryptKMSDataKeyResponseBody getBody() {
        return this.body;
    }

}