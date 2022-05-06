// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateUserGroupsMappingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateUserGroupsMappingResponseBody body;

    public static CreateUserGroupsMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserGroupsMappingResponse self = new CreateUserGroupsMappingResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserGroupsMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserGroupsMappingResponse setBody(CreateUserGroupsMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserGroupsMappingResponseBody getBody() {
        return this.body;
    }

}
