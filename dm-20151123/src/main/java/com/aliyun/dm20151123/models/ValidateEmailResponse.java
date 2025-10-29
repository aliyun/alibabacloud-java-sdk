// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ValidateEmailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateEmailResponseBody body;

    public static ValidateEmailResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateEmailResponse self = new ValidateEmailResponse();
        return TeaModel.build(map, self);
    }

    public ValidateEmailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateEmailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateEmailResponse setBody(ValidateEmailResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateEmailResponseBody getBody() {
        return this.body;
    }

}
