// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class CreateAlertContactResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAlertContactResponseBody body;

    public static CreateAlertContactResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertContactResponse self = new CreateAlertContactResponse();
        return TeaModel.build(map, self);
    }

    public CreateAlertContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAlertContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAlertContactResponse setBody(CreateAlertContactResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAlertContactResponseBody getBody() {
        return this.body;
    }

}
