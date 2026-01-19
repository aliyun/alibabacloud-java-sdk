// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteApplicationRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteApplicationRoleResponseBody body;

    public static DeleteApplicationRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationRoleResponse self = new DeleteApplicationRoleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApplicationRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApplicationRoleResponse setBody(DeleteApplicationRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApplicationRoleResponseBody getBody() {
        return this.body;
    }

}
