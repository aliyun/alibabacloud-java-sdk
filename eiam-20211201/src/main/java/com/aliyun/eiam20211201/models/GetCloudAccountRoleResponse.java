// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetCloudAccountRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCloudAccountRoleResponseBody body;

    public static GetCloudAccountRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAccountRoleResponse self = new GetCloudAccountRoleResponse();
        return TeaModel.build(map, self);
    }

    public GetCloudAccountRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCloudAccountRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCloudAccountRoleResponse setBody(GetCloudAccountRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCloudAccountRoleResponseBody getBody() {
        return this.body;
    }

}
