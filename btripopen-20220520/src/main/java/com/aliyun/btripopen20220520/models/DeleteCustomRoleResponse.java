// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class DeleteCustomRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomRoleResponseBody body;

    public static DeleteCustomRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomRoleResponse self = new DeleteCustomRoleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomRoleResponse setBody(DeleteCustomRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomRoleResponseBody getBody() {
        return this.body;
    }

}
