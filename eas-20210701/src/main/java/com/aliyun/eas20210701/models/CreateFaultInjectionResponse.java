// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateFaultInjectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFaultInjectionResponseBody body;

    public static CreateFaultInjectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFaultInjectionResponse self = new CreateFaultInjectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateFaultInjectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFaultInjectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFaultInjectionResponse setBody(CreateFaultInjectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFaultInjectionResponseBody getBody() {
        return this.body;
    }

}
