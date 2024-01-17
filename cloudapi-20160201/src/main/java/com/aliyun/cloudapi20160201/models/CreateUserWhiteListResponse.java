// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CreateUserWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateUserWhiteListResponseBody body;

    public static CreateUserWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserWhiteListResponse self = new CreateUserWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUserWhiteListResponse setBody(CreateUserWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserWhiteListResponseBody getBody() {
        return this.body;
    }

}
