// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class VerifyAdvertisingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyAdvertisingResponseBody body;

    public static VerifyAdvertisingResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyAdvertisingResponse self = new VerifyAdvertisingResponse();
        return TeaModel.build(map, self);
    }

    public VerifyAdvertisingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyAdvertisingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyAdvertisingResponse setBody(VerifyAdvertisingResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyAdvertisingResponseBody getBody() {
        return this.body;
    }

}
