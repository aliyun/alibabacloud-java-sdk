// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddEmployeesToCustomRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddEmployeesToCustomRoleResponseBody body;

    public static AddEmployeesToCustomRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEmployeesToCustomRoleResponse self = new AddEmployeesToCustomRoleResponse();
        return TeaModel.build(map, self);
    }

    public AddEmployeesToCustomRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddEmployeesToCustomRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddEmployeesToCustomRoleResponse setBody(AddEmployeesToCustomRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddEmployeesToCustomRoleResponseBody getBody() {
        return this.body;
    }

}
