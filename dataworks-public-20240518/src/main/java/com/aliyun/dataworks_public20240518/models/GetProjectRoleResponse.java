// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetProjectRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProjectRoleResponseBody body;

    public static GetProjectRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectRoleResponse self = new GetProjectRoleResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProjectRoleResponse setBody(GetProjectRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectRoleResponseBody getBody() {
        return this.body;
    }

}
