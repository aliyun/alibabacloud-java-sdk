// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDedicatedHostAccountResponseBody body;

    public static CreateDedicatedHostAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedHostAccountResponse self = new CreateDedicatedHostAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedHostAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDedicatedHostAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDedicatedHostAccountResponse setBody(CreateDedicatedHostAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDedicatedHostAccountResponseBody getBody() {
        return this.body;
    }

}
