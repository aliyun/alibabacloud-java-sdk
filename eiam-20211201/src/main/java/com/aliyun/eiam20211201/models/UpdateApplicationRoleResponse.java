// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApplicationRoleResponseBody body;

    public static UpdateApplicationRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationRoleResponse self = new UpdateApplicationRoleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationRoleResponse setBody(UpdateApplicationRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationRoleResponseBody getBody() {
        return this.body;
    }

}
