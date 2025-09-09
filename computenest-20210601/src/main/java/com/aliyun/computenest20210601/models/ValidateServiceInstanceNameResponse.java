// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ValidateServiceInstanceNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateServiceInstanceNameResponseBody body;

    public static ValidateServiceInstanceNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateServiceInstanceNameResponse self = new ValidateServiceInstanceNameResponse();
        return TeaModel.build(map, self);
    }

    public ValidateServiceInstanceNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateServiceInstanceNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateServiceInstanceNameResponse setBody(ValidateServiceInstanceNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateServiceInstanceNameResponseBody getBody() {
        return this.body;
    }

}
