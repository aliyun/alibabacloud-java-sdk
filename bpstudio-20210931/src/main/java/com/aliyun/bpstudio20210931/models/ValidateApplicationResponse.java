// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ValidateApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateApplicationResponseBody body;

    public static ValidateApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateApplicationResponse self = new ValidateApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ValidateApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateApplicationResponse setBody(ValidateApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateApplicationResponseBody getBody() {
        return this.body;
    }

}
