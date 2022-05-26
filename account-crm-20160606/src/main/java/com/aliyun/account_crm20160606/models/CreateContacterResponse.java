// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class CreateContacterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateContacterResponseBody body;

    public static CreateContacterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContacterResponse self = new CreateContacterResponse();
        return TeaModel.build(map, self);
    }

    public CreateContacterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateContacterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateContacterResponse setBody(CreateContacterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateContacterResponseBody getBody() {
        return this.body;
    }

}
