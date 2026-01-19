// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateCloudAccountRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCloudAccountRoleResponseBody body;

    public static CreateCloudAccountRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudAccountRoleResponse self = new CreateCloudAccountRoleResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloudAccountRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloudAccountRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCloudAccountRoleResponse setBody(CreateCloudAccountRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudAccountRoleResponseBody getBody() {
        return this.body;
    }

}
