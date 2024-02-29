// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RemoveProjectMemberFromRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveProjectMemberFromRoleResponseBody body;

    public static RemoveProjectMemberFromRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveProjectMemberFromRoleResponse self = new RemoveProjectMemberFromRoleResponse();
        return TeaModel.build(map, self);
    }

    public RemoveProjectMemberFromRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveProjectMemberFromRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveProjectMemberFromRoleResponse setBody(RemoveProjectMemberFromRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveProjectMemberFromRoleResponseBody getBody() {
        return this.body;
    }

}
