// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteProjectRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteProjectRoleResponseBody body;

    public static DeleteProjectRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectRoleResponse self = new DeleteProjectRoleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProjectRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProjectRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProjectRoleResponse setBody(DeleteProjectRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProjectRoleResponseBody getBody() {
        return this.body;
    }

}
