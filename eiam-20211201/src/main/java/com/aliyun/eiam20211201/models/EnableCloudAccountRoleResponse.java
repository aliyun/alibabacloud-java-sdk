// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableCloudAccountRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableCloudAccountRoleResponseBody body;

    public static EnableCloudAccountRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableCloudAccountRoleResponse self = new EnableCloudAccountRoleResponse();
        return TeaModel.build(map, self);
    }

    public EnableCloudAccountRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableCloudAccountRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableCloudAccountRoleResponse setBody(EnableCloudAccountRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableCloudAccountRoleResponseBody getBody() {
        return this.body;
    }

}
