// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class DeleteEmployeesFromCustomRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEmployeesFromCustomRoleResponseBody body;

    public static DeleteEmployeesFromCustomRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEmployeesFromCustomRoleResponse self = new DeleteEmployeesFromCustomRoleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEmployeesFromCustomRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEmployeesFromCustomRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEmployeesFromCustomRoleResponse setBody(DeleteEmployeesFromCustomRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEmployeesFromCustomRoleResponseBody getBody() {
        return this.body;
    }

}
