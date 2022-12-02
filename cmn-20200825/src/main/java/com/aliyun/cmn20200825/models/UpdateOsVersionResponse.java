// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateOsVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateOsVersionResponseBody body;

    public static UpdateOsVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOsVersionResponse self = new UpdateOsVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOsVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOsVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOsVersionResponse setBody(UpdateOsVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOsVersionResponseBody getBody() {
        return this.body;
    }

}
