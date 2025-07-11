// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateUsersToRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUsersToRoleResponseBody body;

    public static UpdateUsersToRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUsersToRoleResponse self = new UpdateUsersToRoleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUsersToRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUsersToRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUsersToRoleResponse setBody(UpdateUsersToRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUsersToRoleResponseBody getBody() {
        return this.body;
    }

}
