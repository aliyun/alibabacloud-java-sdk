// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteCloudAccountRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCloudAccountRoleResponseBody body;

    public static DeleteCloudAccountRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudAccountRoleResponse self = new DeleteCloudAccountRoleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCloudAccountRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCloudAccountRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCloudAccountRoleResponse setBody(DeleteCloudAccountRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCloudAccountRoleResponseBody getBody() {
        return this.body;
    }

}
