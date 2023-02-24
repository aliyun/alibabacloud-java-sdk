// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class AutoRenewInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AutoRenewInstanceResponseBody body;

    public static AutoRenewInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        AutoRenewInstanceResponse self = new AutoRenewInstanceResponse();
        return TeaModel.build(map, self);
    }

    public AutoRenewInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AutoRenewInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AutoRenewInstanceResponse setBody(AutoRenewInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public AutoRenewInstanceResponseBody getBody() {
        return this.body;
    }

}
