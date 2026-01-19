// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApplicationRoleResponseBody body;

    public static GetApplicationRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationRoleResponse self = new GetApplicationRoleResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApplicationRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApplicationRoleResponse setBody(GetApplicationRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApplicationRoleResponseBody getBody() {
        return this.body;
    }

}
