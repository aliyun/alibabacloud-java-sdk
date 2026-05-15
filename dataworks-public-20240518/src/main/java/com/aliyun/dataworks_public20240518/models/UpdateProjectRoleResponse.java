// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateProjectRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProjectRoleResponseBody body;

    public static UpdateProjectRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectRoleResponse self = new UpdateProjectRoleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProjectRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProjectRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProjectRoleResponse setBody(UpdateProjectRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProjectRoleResponseBody getBody() {
        return this.body;
    }

}
