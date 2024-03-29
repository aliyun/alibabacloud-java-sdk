// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateUserGroupsMappingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateUserGroupsMappingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUserGroupsMappingResponse setBody(CreateUserGroupsMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserGroupsMappingResponseBody getBody() {
        return this.body;
    }

}
