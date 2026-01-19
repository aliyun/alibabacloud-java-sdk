// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableCloudAccountRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableCloudAccountRoleResponseBody body;

    public static DisableCloudAccountRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableCloudAccountRoleResponse self = new DisableCloudAccountRoleResponse();
        return TeaModel.build(map, self);
    }

    public DisableCloudAccountRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableCloudAccountRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableCloudAccountRoleResponse setBody(DisableCloudAccountRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableCloudAccountRoleResponseBody getBody() {
        return this.body;
    }

}
