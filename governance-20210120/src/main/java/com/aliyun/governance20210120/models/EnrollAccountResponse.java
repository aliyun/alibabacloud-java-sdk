// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class EnrollAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnrollAccountResponseBody body;

    public static EnrollAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        EnrollAccountResponse self = new EnrollAccountResponse();
        return TeaModel.build(map, self);
    }

    public EnrollAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnrollAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnrollAccountResponse setBody(EnrollAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public EnrollAccountResponseBody getBody() {
        return this.body;
    }

}
