// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class CreateDrdsInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDrdsInstanceResponseBody body;

    public static CreateDrdsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDrdsInstanceResponse self = new CreateDrdsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDrdsInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDrdsInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDrdsInstanceResponse setBody(CreateDrdsInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDrdsInstanceResponseBody getBody() {
        return this.body;
    }

}
