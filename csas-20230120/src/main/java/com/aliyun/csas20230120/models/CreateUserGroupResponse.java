// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateUserGroupResponseBody body;

    public static CreateUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserGroupResponse self = new CreateUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUserGroupResponse setBody(CreateUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserGroupResponseBody getBody() {
        return this.body;
    }

}
