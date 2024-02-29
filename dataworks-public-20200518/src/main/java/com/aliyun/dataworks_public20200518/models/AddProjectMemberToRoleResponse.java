// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class AddProjectMemberToRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddProjectMemberToRoleResponseBody body;

    public static AddProjectMemberToRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddProjectMemberToRoleResponse self = new AddProjectMemberToRoleResponse();
        return TeaModel.build(map, self);
    }

    public AddProjectMemberToRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddProjectMemberToRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddProjectMemberToRoleResponse setBody(AddProjectMemberToRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddProjectMemberToRoleResponseBody getBody() {
        return this.body;
    }

}
