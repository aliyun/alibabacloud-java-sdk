// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ValidateInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateInstanceResponseBody body;

    public static ValidateInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateInstanceResponse self = new ValidateInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ValidateInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateInstanceResponse setBody(ValidateInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateInstanceResponseBody getBody() {
        return this.body;
    }

}
