// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateDrdsDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDrdsDBResponseBody body;

    public static CreateDrdsDBResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDrdsDBResponse self = new CreateDrdsDBResponse();
        return TeaModel.build(map, self);
    }

    public CreateDrdsDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDrdsDBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDrdsDBResponse setBody(CreateDrdsDBResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDrdsDBResponseBody getBody() {
        return this.body;
    }

}
