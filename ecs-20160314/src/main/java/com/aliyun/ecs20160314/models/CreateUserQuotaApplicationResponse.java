// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateUserQuotaApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateUserQuotaApplicationResponseBody body;

    public static CreateUserQuotaApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserQuotaApplicationResponse self = new CreateUserQuotaApplicationResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserQuotaApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserQuotaApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUserQuotaApplicationResponse setBody(CreateUserQuotaApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserQuotaApplicationResponseBody getBody() {
        return this.body;
    }

}
