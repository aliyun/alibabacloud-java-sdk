// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateDigitalEmployeeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDigitalEmployeeResponseBody body;

    public static CreateDigitalEmployeeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalEmployeeResponse self = new CreateDigitalEmployeeResponse();
        return TeaModel.build(map, self);
    }

    public CreateDigitalEmployeeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDigitalEmployeeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDigitalEmployeeResponse setBody(CreateDigitalEmployeeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDigitalEmployeeResponseBody getBody() {
        return this.body;
    }

}
