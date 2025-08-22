// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ValidateModuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateModuleResponseBody body;

    public static ValidateModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateModuleResponse self = new ValidateModuleResponse();
        return TeaModel.build(map, self);
    }

    public ValidateModuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateModuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateModuleResponse setBody(ValidateModuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateModuleResponseBody getBody() {
        return this.body;
    }

}
