// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CreateUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUsersResponseBody body;

    public static CreateUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUsersResponse self = new CreateUsersResponse();
        return TeaModel.build(map, self);
    }

    public CreateUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUsersResponse setBody(CreateUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUsersResponseBody getBody() {
        return this.body;
    }

}
