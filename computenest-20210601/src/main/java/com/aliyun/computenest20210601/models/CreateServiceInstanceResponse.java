// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateServiceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateServiceInstanceResponseBody body;

    public static CreateServiceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceInstanceResponse self = new CreateServiceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceInstanceResponse setBody(CreateServiceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceInstanceResponseBody getBody() {
        return this.body;
    }

}
