// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class RemoveMemberRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveMemberRoleResponseBody body;

    public static RemoveMemberRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveMemberRoleResponse self = new RemoveMemberRoleResponse();
        return TeaModel.build(map, self);
    }

    public RemoveMemberRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveMemberRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveMemberRoleResponse setBody(RemoveMemberRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveMemberRoleResponseBody getBody() {
        return this.body;
    }

}
