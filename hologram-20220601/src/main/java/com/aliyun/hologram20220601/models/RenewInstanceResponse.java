// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class RenewInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RenewInstanceResponseBody body;

    public static RenewInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewInstanceResponse self = new RenewInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RenewInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewInstanceResponse setBody(RenewInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewInstanceResponseBody getBody() {
        return this.body;
    }

}
