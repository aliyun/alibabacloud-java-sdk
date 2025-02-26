// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class CreateDefaultRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDefaultRoleResponseBody body;

    public static CreateDefaultRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDefaultRoleResponse self = new CreateDefaultRoleResponse();
        return TeaModel.build(map, self);
    }

    public CreateDefaultRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDefaultRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDefaultRoleResponse setBody(CreateDefaultRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDefaultRoleResponseBody getBody() {
        return this.body;
    }

}
