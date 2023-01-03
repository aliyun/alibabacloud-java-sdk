// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateSubnetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSubnetResponseBody body;

    public static CreateSubnetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSubnetResponse self = new CreateSubnetResponse();
        return TeaModel.build(map, self);
    }

    public CreateSubnetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSubnetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSubnetResponse setBody(CreateSubnetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSubnetResponseBody getBody() {
        return this.body;
    }

}
